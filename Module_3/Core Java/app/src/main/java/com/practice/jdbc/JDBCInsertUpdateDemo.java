package com.practice.jdbc;

/**
 * 32. Insert and Update Operations in JDBC
 * Performs insert and update using PreparedStatement.
 */
public class JDBCInsertUpdateDemo {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        try {
            int inserted = dao.insertStudent("Martin", 24, "martin@example.com");
            System.out.println("Rows inserted: " + inserted);
            int updated = dao.updateStudentEmail(1, "updated@example.com");
            System.out.println("Rows updated: " + updated);
        } catch (Exception e) {
            System.err.println("Database operation failed: " + e.getMessage());
        }
    }
}
