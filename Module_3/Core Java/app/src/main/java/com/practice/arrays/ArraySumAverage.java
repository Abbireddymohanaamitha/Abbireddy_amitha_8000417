package com.practice.arrays;

import java.util.Scanner;

/**
 * 14. Array Sum and Average
 * Computes the sum and average of an array of numbers.
 */
public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("How many numbers do you want to enter?");
            int count = scanner.nextInt();
            if (count <= 0) {
                System.err.println("Please enter a positive count.");
                return;
            }

            double[] numbers = new double[count];
            for (int i = 0; i < count; i++) {
                System.out.printf("Enter number %d:%n", i + 1);
                numbers[i] = scanner.nextDouble();
            }

            double sum = 0;
            for (double number : numbers) {
                sum += number;
            }

            double average = sum / count;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Time complexity: O(n)");
        } catch (Exception e) {
            System.err.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}
