package com.example.demo.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = "jdbc:sqlserver://localhost:1433;database=demo;encrypt=true;trustServerCertificate=true";

    private static final String USERNAME = "sa";

    private static final String PASS = "25121996";
    private static Connection conn = null;

    public static Connection openConnection() {
        if (conn != null) return conn;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASS);
        } catch (Exception ignored) {
        }
        return conn;
    }

    public static void closeConnection(Connection conn, CallableStatement callST) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (callST != null) {

            try {
                callST.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
