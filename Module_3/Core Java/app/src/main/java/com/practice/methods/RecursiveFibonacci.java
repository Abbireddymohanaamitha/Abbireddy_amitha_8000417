package com.practice.methods;

import java.util.Scanner;

/**
 * 13. Recursive Fibonacci
 * Uses recursion to compute Fibonacci numbers.
 */
public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter position for Fibonacci series (0 or positive integer):");
            int n = scanner.nextInt();
            if (n < 0) {
                System.err.println("Please enter a non-negative integer.");
            } else {
                System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
                System.out.println("Note: recursive Fibonacci has exponential time complexity O(2^n) without memoization.");
            }
        } catch (Exception e) {
            System.err.println("Invalid input. Enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
