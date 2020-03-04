package com.luo5.blob;

import com.luo3.util.JDBCUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
