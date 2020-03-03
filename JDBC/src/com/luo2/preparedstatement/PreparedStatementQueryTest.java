package com.luo2.preparedstatement;

import com.luo3.bean.User;
import com.luo3.util.JDBCUtils;
import org.junit.Test;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * @author luo
 * @date 2020/3/3 22:08
 * @Description 对不同表通用的查询操作
 */
public class PreparedStatementQueryTest {
    @Test
    public void testGetInstance(){
        String sql="select id,name,password,birth from user where id = ?";
        User user = getInstance(User.class, sql, 1);
        System.out.println(user);
    }
    //泛型方法
    public  <T> T getInstance(Class<T> clazz, String sql, Object...args){
        Connection conn= null;
        PreparedStatement ps= null;
        ResultSet rs= null;
        try {
            conn = JDBCUtils.getConnection();

            ps = conn.prepareStatement(sql);
            for(int i=0;i<args.length;i++){
                ps.setObject(i+1,args[i]);
            }

            rs = ps.executeQuery();
            //获取元数据：ResultSetMetaData
            ResultSetMetaData resultSetMetaData=rs.getMetaData();
            //通过ResultSetMetaData获取结果集中的列数
            int columnCount =resultSetMetaData.getColumnCount();
            if(rs.next()){
                T t = clazz.newInstance();
                //处理结果集中一行数据的每一列
                for(int i=0;i<columnCount;i++){
                    //获取列值
                    Object columnValue = rs.getObject(i+1);
                    //获取列名（别名）
                    String columnLabel=resultSetMetaData.getColumnLabel(i+1);
                    //给对象指定columnName属性，通过 *反射* 赋值为columnValue
                    Field field=clazz.getDeclaredField(columnLabel);
                    field.setAccessible(true);
                    field.set(t,columnValue);
                }
                return t;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn,ps,rs);
        }
        return null;
    }
}
