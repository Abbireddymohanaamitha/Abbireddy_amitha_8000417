package com.practice.collections;

import com.practice.collections.StudentRecord;

/**
 * 29. Records (Java 16+)
 * Demonstrates immutable compact data carriers.
 */
public class RecordDemo {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord("Alice", 21, "alice@example.com");
        System.out.println("Student record: " + student);
        System.out.println("Name: " + student.name());
        System.out.println("Email: " + student.email());
    }
}
