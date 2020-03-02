package com.luo3.util;

import com.luo1.connection.ConnectionTest;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author luo
 * @date 2020/3/3 2:04
 * @Description 操作数据库的工具类
 */

public class JDBCUtils {
    /**
     * @author luo
     * @date 2020/3/3 2:35
     * @Description 获取数据连接
     */
    public static Connection getConnection() throws Exception {
        //1、读取配置
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
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
        return connection;
    }
    /**
     * @author luo
     * @date 2020/3/3 2:38
     * @Description 关闭连接和Statement操作
     */
    public static void closeResource(Connection connection, PreparedStatement ps){
        try{
            if(ps!=null)
                ps.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        try {
            if(connection!=null)
                connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void closeResource(Connection connection, PreparedStatement ps,ResultSet rs){
        try{
            if(ps!=null)
                ps.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        try {
            if(connection!=null)
                connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        try {
            if(rs!=null)
                rs.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
