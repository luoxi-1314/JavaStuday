package com.luo2.preparedstatement;

import com.luo3.bean.User;
import com.luo3.util.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author luo
 * @date 2020/3/3 3:55
 * @Description 针对某个表的查询操作
 */
public class Query {

    @Test
    public void testQuery1(){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "select id,name,password,birth from user where id = ?";
            ps = connection.prepareStatement(sql);
            ps.setObject(1,1);
            //执行，返回结果集
            resultSet = ps.executeQuery();
            //处理数据
            if(resultSet.next()){//判断结果集下一条是否有数据
                //获取该条数据的各个字段
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String password = resultSet.getString(3);
                Date birth = resultSet.getDate(4);

    //          //方式一：
    //          System.out.println("id = " + id + ",name = " + name + ",password = " + password + ",birth = " + birth);
    //          //方式二：
    //          Object[] data=new Object[]{id,name,password,birth};
                //方式三：将数据封装为一个对象 √
                User user = new User(id, name, password, birth);
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            JDBCUtils.closeResource(connection,ps,resultSet);
        }

    }
}
