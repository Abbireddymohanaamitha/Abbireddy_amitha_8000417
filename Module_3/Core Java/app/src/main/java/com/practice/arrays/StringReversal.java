package com.practice.arrays;

import java.util.Scanner;

/**
 * 15. String Reversal
 * Reverses a string using a loop and StringBuilder.
 */
public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a string to reverse:");
            String input = scanner.nextLine();
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println("Reversed string: " + reversed);
            System.out.println("Time complexity: O(n)");
        } catch (Exception e) {
            System.err.println("An error occurred while reversing the string.");
        } finally {
            scanner.close();
        }
    }
}
