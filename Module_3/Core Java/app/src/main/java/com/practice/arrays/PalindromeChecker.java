package com.practice.arrays;

import java.util.Scanner;

/**
 * 16. Palindrome Checker
 * Checks if a string is the same forwards and backwards.
 */
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter text to check for palindrome:");
            String input = scanner.nextLine();
            String normalized = input.replaceAll("\\s+", "").toLowerCase();
            String reversed = new StringBuilder(normalized).reverse().toString();
            boolean isPalindrome = normalized.equals(reversed);
            System.out.println(input + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
            System.out.println("Time complexity: O(n)");
        } catch (Exception e) {
            System.err.println("Error while checking palindrome.");
        } finally {
            scanner.close();
        }
    }
}
