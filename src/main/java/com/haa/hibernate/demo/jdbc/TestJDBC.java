package com.haa.hibernate.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {
    public static void main(String[] args) throws SQLException {
        String jdbcURL = "jdbc:mysql://localhost:3307/hb_student_tracker?useSSL=false&allowPublicKeyRetrieval=true";
        String user = "hbstudent";
        String pass = "hbstudent";

        Connection conn = null;
        try {
            System.out.println("Connect to Database : " + jdbcURL);

            conn = DriverManager.getConnection(jdbcURL, user, pass);

            System.out.println("Connection Successful !!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null)
                conn.close();
        }
    }
}
