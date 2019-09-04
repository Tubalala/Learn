package cn.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo03 {
    public static void main(String[] args) {
        Statement sta = null;
        Connection conn =null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql = "update account set account = 1600 where name = 'abcl'";
            conn = DriverManager.getConnection("jdbc:mysql:///db3","root","abc123!@#");
            sta = conn.createStatement();
            int count = sta.executeUpdate(sql);
            System.out.println(count);
            if (count > 0) {
                System.out.println("修改成功！");
            }else {
                System.out.println("修改失败！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (sta != null) {
                try {
                    sta.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
