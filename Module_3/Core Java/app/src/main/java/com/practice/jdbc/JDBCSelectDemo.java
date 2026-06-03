package com.practice.jdbc;

/**
 * 32. Insert and Update Operations in JDBC
 * Demonstrates select queries with prepared statements.
 */
public class JDBCSelectDemo {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        try {
            var students = dao.getStudents();
            if (students.isEmpty()) {
                System.out.println("No students found in the database.");
            } else {
                System.out.println("Students:");
                students.forEach(System.out::println);
            }
        } catch (Exception e) {
            System.err.println("Error reading students: " + e.getMessage());
        }
    }
}
