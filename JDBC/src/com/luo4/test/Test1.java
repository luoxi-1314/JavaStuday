package com.luo4.test;

import com.luo3.util.JDBCUtils;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test1 {
    @Test
    public void testInsert(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入id：");
        String id =scanner.next();
        System.out.println("输入用户名：");
        String user=scanner.next();
        System.out.println("输入密码：");
        String password=scanner.next();
        System.out.println("输入生日：");
        String birth=scanner.next();

        String sql="insert into user(id,user,password,birth)values(?,?,?,?)";
        int insertCount = update(sql, id, user, password, birth);
        if(insertCount>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
    public int update(String sql,Object ...args){
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            //1、获取数据库连接
            connection = JDBCUtils.getConnection();
            //2、预编译
            ps = connection.prepareStatement(sql);
            //3、填充占位符
            for(int i=0;i<args.length;i++){
                ps.setObject(i+1,args[i]);//注意从1开始
            }
            //4、执行
            /** ps.execute():
             *  查询return true
             *  如果是更新则return false
             */
           // ps.execute();
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //5、资源关闭
            JDBCUtils.closeResource(connection,ps);
        }
        return 0;
    }
}
