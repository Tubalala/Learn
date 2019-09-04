package cn.demo01.loginCheck;

import util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        boolean login = new Demo01().login(username, password);
        if (login) {
            System.out.println("登录成功！！！");
        }else{
            System.out.println("账户或密码名错误！！！");
        }
    }
    public boolean login(String username,String password){
        if (username == null && password == null) {
            return false;
        }
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select *from user where username = ? and password= ? ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            rs = pstmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstmt,conn);
        }
        return false;
    }

}
