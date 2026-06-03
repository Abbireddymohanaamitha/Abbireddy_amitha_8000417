package com.practice.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object for interacting with the students table.
 */
public class StudentDAO {
    public List<String> getStudents() throws SQLException {
        String sql = "SELECT id, name, age, email FROM students";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            List<String> students = new ArrayList<>();
            while (resultSet.next()) {
                String student = String.format("%d: %s, %d, %s",
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"),
                        resultSet.getString("email"));
                students.add(student);
            }
            return students;
        }
    }

    public int insertStudent(String name, int age, String email) throws SQLException {
        String sql = "INSERT INTO students (name, age, email) VALUES (?, ?, ?)";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);
            statement.setInt(2, age);
            statement.setString(3, email);
            return statement.executeUpdate();
        }
    }

    public int updateStudentEmail(int id, String newEmail) throws SQLException {
        String sql = "UPDATE students SET email = ? WHERE id = ?";
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, newEmail);
            statement.setInt(2, id);
            return statement.executeUpdate();
        }
    }
}
