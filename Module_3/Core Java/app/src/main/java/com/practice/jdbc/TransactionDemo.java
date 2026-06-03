package com.practice.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 33. Transaction Handling in JDBC
 * Demonstrates transaction management with commit and rollback.
 */
public class TransactionDemo {
    public static void main(String[] args) {
        String insertSql = "INSERT INTO students (name, age, email) VALUES (?, ?, ?)";
        try (Connection connection = DBConnection.getConnection()) {
            connection.setAutoCommit(false);
            try (PreparedStatement insertStmt = connection.prepareStatement(insertSql)) {
                insertStmt.setString(1, "TransactionUser");
                insertStmt.setInt(2, 29);
                insertStmt.setString(3, "tx@example.com");
                insertStmt.executeUpdate();

                insertStmt.setString(1, "TransactionUser2");
                insertStmt.setInt(2, 30);
                insertStmt.setString(3, "tx2@example.com");
                insertStmt.executeUpdate();

                connection.commit();
                System.out.println("Transaction committed successfully.");
            } catch (SQLException e) {
                connection.rollback();
                System.err.println("Transaction rolled back due to error: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }
    }
}
