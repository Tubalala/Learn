package cn.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo01 {
    public static void main(String[] args) throws Exception{
        //1.导入驱动包
        //2.注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //3.获取数据库连接对象Connection
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db3?useUnicode=true&characterEncoding=UTF-8&useSSL=false","root","abc123!@#");
        //4.定义sql语句
        String sql = "update account set account = 500 where id = 1";
        //5.获取执行SQL语句的对象Statement
        Statement stmt = conn.createStatement();
        //6.执行sql，接受返回结果
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();
    }
}
