package com.luo2.preparedstatement;
/**
 * @author luo
 * @date 2020/3/3 2:32
 * @Description 使用PreparedStatement代替Statement,实现对数据表的增删改查
 */
import com.luo3.util.JDBCUtils;
import org.junit.Test;
import java.io.InputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Properties;

public class PreparedStatementUpdateTest {
    @Test //增加数据
    public void testInsert(){
        Connection connection=null;
        PreparedStatement ps=null;
        try {
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
            connection = DriverManager.getConnection(url, user, password);
//        System.out.println(connection);
            //4、预编译sql
            String sql="insert into user(id,name,password,birth) values(?,?,?,?)";  //？表示占位符
            ps = connection.prepareStatement(sql);
            //5、填充占位符
            ps.setInt(1,1);//参数从 1 开始
            ps.setString(2,"AA");
            ps.setString(3,"123456");
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date=sdf.parse("1000-01-01");
            ps.setDate(4,new Date(date.getTime()));
            //6、执行操作
            ps.execute();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //7、资源关闭
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
    }

    @Test //修改数据
    public void testUpdate() {
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            //1、获取数据库连接
            connection = JDBCUtils.getConnection();
            //2、预编译
            String sql="update user set name = ? where id = ?";
            ps = connection.prepareStatement(sql);
            //3、填充占位符
            ps.setObject(1,"AB");
            ps.setObject(2,"1");
            //4、执行
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //5、资源关闭
            JDBCUtils.closeResource(connection,ps);
        }
    }

    @Test //常见修改
    public void testCommonUpdate(){
//      String sql = "delete from user where id = ?";
//      Update(sql,1);

        String sql = "update `user` set name = ? where id = ?";
        Update(sql,"BB","1");
    }

    //通用的增删改操作  ↓sql中占位符个数与可变形参长度相同↓
    public void Update(String sql,Object ...args){
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
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //5、资源关闭
            JDBCUtils.closeResource(connection,ps);
        }
    }
}
