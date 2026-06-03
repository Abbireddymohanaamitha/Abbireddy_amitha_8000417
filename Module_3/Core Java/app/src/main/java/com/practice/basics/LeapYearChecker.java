package com.practice.basics;

import java.util.Scanner;

/**
 * 4. Leap Year Checker
 * Implements the leap year rule used by Gregorian calendar.
 */
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a year to check:");
            int year = scanner.nextInt();
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            System.out.println(year + (isLeap ? " is a leap year." : " is not a leap year."));
            System.out.println("Time complexity: O(1)");
        } catch (Exception e) {
            System.err.println("Invalid year entered.");
        } finally {
            scanner.close();
        }
    }
}
