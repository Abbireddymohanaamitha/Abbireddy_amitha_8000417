package com.practice.exceptions;

import java.util.Scanner;

/**
 * 21. Custom Exception
 * Shows how to define and throw a custom exception.
 */
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter age:");
            int age = scanner.nextInt();
            validateAge(age);
            System.out.println("Age is valid: " + age);
        } catch (InvalidAgeException e) {
            System.err.println("Validation failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120.");
        }
    }
}
