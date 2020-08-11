package com.test.module;

import java.sql.*;

/**
 * @Author: zhaomengjie
 * @Date: 2020/7/30 23:34
 * @Version 1.0
 */
public class JdbcTemplate {
    public static void main(String[] args) {
        try {
            Class.forName("jdbc.mysql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("127.0.0.1:3306");
            preparedStatement = conn.prepareStatement("select sysdate()");
            rs = preparedStatement.executeQuery();
            while(rs.next()){
                Date date = rs.getDate(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
