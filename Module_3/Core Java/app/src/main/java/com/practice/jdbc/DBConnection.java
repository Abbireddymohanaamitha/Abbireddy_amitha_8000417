package com.practice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 31. Basic JDBC Connection
 * Provides a reusable method to connect to MySQL.
 */
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
