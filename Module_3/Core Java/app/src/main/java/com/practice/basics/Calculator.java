package com.practice.basics;

import java.util.Scanner;

/**
 * 2. Simple Calculator
 * Demonstrates basic arithmetic operations with user input.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter first number:");
            double first = scanner.nextDouble();
            System.out.println("Enter second number:");
            double second = scanner.nextDouble();

            System.out.println("Addition: " + (first + second));
            System.out.println("Subtraction: " + (first - second));
            System.out.println("Multiplication: " + (first * second));
            if (second != 0) {
                System.out.println("Division: " + (first / second));
            } else {
                System.out.println("Division: Cannot divide by zero");
            }
            System.out.println("Modulo: " + (first % second));
            System.out.println("Sample Output: 10 + 5 = 15.0");
        } catch (Exception e) {
            System.err.println("Invalid input, please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}
