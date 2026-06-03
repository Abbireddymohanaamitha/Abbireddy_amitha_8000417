package com.practice.basics;

import java.util.Scanner;

/**
 * 5. Multiplication Table
 * Prints a multiplication table for the requested number.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter an integer for multiplication table:");
            int number = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", number, i, number * i);
            }
            System.out.println("Time complexity: O(n), n = 10 constant time");
        } catch (Exception e) {
            System.err.println("Invalid input for multiplication table.");
        } finally {
            scanner.close();
        }
    }
}
