package cn.demo01;

import java.sql.*;

public class Demo05 {
    public static void main(String[] args) {
        Statement sta = null;
        Connection conn =null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db3?useUnicode=true&characterEncoding=UTF-8&useSSL=false","root","abc123!@#");
            String sql = "select * from account";
            sta = conn.createStatement();
            rs = sta.executeQuery(sql);
            //遍历获取
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double account = rs.getDouble(3);
                System.out.println(id+"---"+name+"---"+account);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
