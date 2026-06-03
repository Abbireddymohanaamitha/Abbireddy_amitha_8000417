package com.practice.basics;

import java.util.Scanner;

/**
 * 3. Even or Odd Checker
 * Uses the modulo operator to determine parity.
 */
public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter an integer to check even or odd:");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
            System.out.println("Time complexity: O(1)");
        } catch (Exception e) {
            System.err.println("Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
