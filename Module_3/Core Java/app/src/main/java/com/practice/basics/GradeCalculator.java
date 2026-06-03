package com.practice.basics;

import java.util.Scanner;

/**
 * 9. Grade Calculator
 * Calculates letter grades based on numeric score.
 */
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter student's score (0-100):");
            int score = scanner.nextInt();
            String grade;
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Grade: " + grade);
            System.out.println("Time complexity: O(1)");
        } catch (Exception e) {
            System.err.println("Please enter a valid integer score.");
        } finally {
            scanner.close();
        }
    }
}
