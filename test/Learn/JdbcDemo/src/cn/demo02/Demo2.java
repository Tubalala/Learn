package cn.demo02;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;


public class Demo2 {
    public static void main(String[] args) throws Exception {
        DataSource ds = new ComboPooledDataSource();
        for (int i = 1; i < 10; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i+":"+conn);
        }
    }
}
