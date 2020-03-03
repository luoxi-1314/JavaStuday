package com.luo2.preparedstatement;

import com.luo3.bean.User;
import com.luo3.util.JDBCUtils;
import org.junit.Test;

import java.lang.reflect.Field;
import java.sql.*;

/**
 * @author luo
 * @date 2020/3/3 3:55
 * @Description 针对某个表的查询操作
 */
public class Query {

    @Test  //查询并输出某条数据的所有字段
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

    @Test
    public void testQueryForUser(){
        String sql="select id,name,password,birth from user where id = ?";
        User user = queryForUser(sql, 1);
        System.out.println(user);

        String sql1="select id,password from user where id = ?";
        User user1 = queryForUser(sql1,1);
        System.out.println(user1);
    }
    /**
     * @author luo
     * @date 2020/3/3 6:08
     * @Description 通用查询操作
     */
    User queryForUser(String sql, Object...args){
        Connection connection= null;
        PreparedStatement preparedStatement= null;
        ResultSet resultSet= null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            for(int i=0;i<args.length;i++){
                preparedStatement.setObject(i+1,args[i]);
            }
            resultSet = preparedStatement.executeQuery();
            //获取元数据：ResultSetMetaData
            ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
            //通过ResultSetMetaData获取结果集中的列数
            int columnCount =resultSetMetaData.getColumnCount();
            if(resultSet.next()){
                User user =new User();
                //处理结果集中一行数据的每一列
                for(int i=0;i<columnCount;i++){
                    //获取列值
                    Object columnValue = resultSet.getObject(i+1);
                    //获取列名:getColumnName()
                    /* 获取别名:getColumnLabel() *///bean中定义名可能和数据库中列名不同而导致异常，使用别名则可避免
                    String columnLabel=resultSetMetaData.getColumnLabel(i+1);
                    //给user对象指定columnName属性，通过 *反射* 赋值为columnValue
                    Field field=User.class.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(user,columnValue);
                }
                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(connection,preparedStatement,resultSet);
        }
        return null;
    }
}
