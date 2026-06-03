package com.practice.basics;

import java.util.Scanner;

/**
 * 11. Factorial Calculator
 * Computes factorial of a non-negative integer.
 */
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a non-negative integer:");
            int number = scanner.nextInt();
            if (number < 0) {
                System.err.println("Factorial is not defined for negative numbers.");
            } else {
                System.out.println(number + "! = " + factorial(number));
                System.out.println("Time complexity: O(n)");
            }
        } catch (Exception e) {
            System.err.println("Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
