package com.luo1.connection;

import org.junit.Test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionTest {
    //方式一
    @Test
    public void testConnection1() throws SQLException {
        Driver driver = new  com.mysql.jdbc.Driver();
        String url="jdbc:mysql://localhost:3306/mybatis";
        Properties info=new Properties();
        info.setProperty("user","root");
        info.setProperty("password","admin");
        Connection connection= driver.connect(url,info);
        System.out.println(connection);
    }
    //方式二：可移植性
    @Test
    public void testConnection2() throws Exception{
        //使用反射
        Class clazz =Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();
        String url="jdbc:mysql://localhost:3306/mybatis";
        Properties info=new Properties();
        info.setProperty("user","root");
        info.setProperty("password","admin");
        Connection connection= driver.connect(url,info);
        System.out.println(connection);
    }
    //方式三：DriverManager替代Driver
    @Test
    public void testConnection3() throws Exception{
        //获取Driver实现类对象
        Class clazz =Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();
        //提供三条信息
        String url="jdbc:mysql://localhost:3306/mybatis";
        String user="root";
        String password="admin";
        //注册驱动
        DriverManager.registerDriver(driver);
        //获取连接
        Connection connection=DriverManager.getConnection(url,user,password);
        System.out.println(connection);
    }
    //方式四：三的优化
    @Test
    public void testConnection4() throws Exception{
        String url="jdbc:mysql://localhost:3306/mybatis";
        String user="root";
        String password="admin";
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");//mysql实现类中声明了
        Connection connection=DriverManager.getConnection(url,user,password);
        System.out.println(connection);
    }
    //方式五：最终版( 将数据库需要的信息放在配置文件中)
    /*
     * 1、实现数据代码分离，实现了解耦
     * 2、避免程序再次打包
     */
    @Test
    public void testConnection5() throws Exception{
        //1、读取配置
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(is);
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driverClass= properties.getProperty("driverClass");
        //2、加载驱动
        Class.forName(driverClass);
        //3、获取连接
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
}
