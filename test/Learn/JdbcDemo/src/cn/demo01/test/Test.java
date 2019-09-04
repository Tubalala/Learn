package cn.demo01.test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/*
* java将db3中account表的内容封装成对象*/
public class Test {
    public static void main(String[] args) {
        List<Account> list = new Test().get();
        System.out.println(list);
    }
    public List<Account> get(){
        List<Account> list = null;
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "abc123!@#");
            sta = conn.createStatement();
            String sql = "select * from account";
            rs = sta.executeQuery(sql);
            Account ac = null;
            list = new ArrayList<Account>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int account = rs.getInt("account");
                ac = new Account();
                ac.setId(id);
                ac.setName(name);
                ac.setAccount(account);
                list.add(ac);
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

            if (conn != null) {
                try {
                    conn.close();
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
        }
        return list;
    }
}
