package com.luo.test;


import com.luo.dao.UserDao;
import com.luo.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    @Test
    public void testInit() {
        try {
            // 1. 读取配置文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            // 2. 创建 SqlSessionFactory 工厂
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = builder.build(is);
            // 3. 获取 SqlSession 对象
            SqlSession sqlSession = factory.openSession();
            // 4. 使用 SqlSession 创建 Mapper 的代理对象
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            // 5. 使用代理对象执行查询
            List<User> users = userDao.listUser();
            users.forEach(System.out::println);
            // 6. 释放资源
            sqlSession.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
