package com.luo5.blob;

import com.luo3.bean.User;
import com.luo3.util.JDBCUtils;
import org.junit.Test;

import java.io.*;
import java.sql.*;

/**
 * @author luo
 * @date 2020/3/4 16:50
 * @Description 测试使用PreparedStatement操作Blob类型数据
 */
public class BlobTest {
    @Test
    public void testInsert() throws Exception {
        Connection conn = JDBCUtils.getConnection();
        String sql="insert into test(name,birth,photo)values(?,?,?) ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setObject(1,"A");
        ps.setObject(2,"2010-8-9");
        FileInputStream is=new FileInputStream(new File("src/image.png"));
        ps.setBlob(3,is);
        ps.execute();
        JDBCUtils.closeResource(conn,ps);
    }
    /**
     * @author luo
     * @date 2020/3/6 11:06
     * @Description Blob数据查询操作
     */
    @Test
    public void testQuery(){
        Connection connection= null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql="select id,name,birth,photo from test where id = ?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1,2);
            rs = ps.executeQuery();
            if(rs.next()){
                //方式一：索引
    //            String name=rs.getString(1);
    //            Date birth=rs.getDate(2);

                //方式二：别名
                int id =rs.getInt("id");
                String name = rs.getString("name");
                Date birth = rs.getDate("birth");

                com.luo3.bean.Test test =new com.luo3.bean.Test(id,name,birth);
                System.out.println(test);
                //将Blob类型字段以文件形式保存到本地
                Blob photo = rs.getBlob("photo");
                is=photo.getBinaryStream();
                fos=new FileOutputStream("1.png");
                byte[] buffer = new byte[1024];
                int len;
                while ((len = is.read(buffer)) != -1){
                    fos.write(buffer,0,len);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(is != null)
                    is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            JDBCUtils.closeResource(connection,ps,rs);
        }

    }
}
