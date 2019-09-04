package Druid_Demo;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;

import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        InputStream is = Demo1.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);
//        pro.load(new FileReader("D:\\代码\\idea java\\test\\Learn\\JdbcDemo01\\src\\druid.properties"));

        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        Connection connection = ds.getConnection();
        System.out.println(connection);
    }
}
