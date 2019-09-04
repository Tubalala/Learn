package cn.demo01.thingsManger;

import util.JDBCUtils;

import java.sql.*;

public class Demo1 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        ResultSet rs = null;
        Statement stamt = null;
        try {

            conn = JDBCUtils.getConnection();

            String sql1 = "update account set account = account - ? where id = ?";
            String sql2 = "update account set account = account + ? where id = ?";
            String sql3 = "select * from account";

            //开启事务
            conn.setAutoCommit(false);

            stamt = conn.createStatement();

            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);

            pstmt1.setDouble(1,500);
            pstmt1.setInt(2,1);

            pstmt2.setDouble(1,500);
            pstmt2.setInt(2,2);

            pstmt1.executeUpdate();
            pstmt2.executeUpdate();
            //提交事务
            conn.commit();

            rs = stamt.executeQuery(sql3);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double account = rs.getDouble("account");
                System.out.println("id:"+id+" name:"+name+" account:"+account);
            }


        } catch (Exception e) {
            try {
                if (conn != null) {
                    //事件回滚
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,stamt,conn);
            JDBCUtils.close(pstmt1,null);
            JDBCUtils.close(pstmt2,null);
        }
    }
}
