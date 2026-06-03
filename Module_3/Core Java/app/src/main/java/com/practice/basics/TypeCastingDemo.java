package com.practice.basics;

/**
 * 7. Type Casting Example
 * Demonstrates widening and narrowing conversions.
 */
public class TypeCastingDemo {
    public static void main(String[] args) {
        double original = 9.78;
        int narrowed = (int) original; // Explicit cast, fractional part lost
        int value = 100;
        double widened = value; // Implicit cast, safe conversion

        System.out.println("Original double: " + original);
        System.out.println("Explicit cast to int: " + narrowed);
        System.out.println("Implicit cast to double: " + widened);
        System.out.println("Time complexity: O(1)");
    }
}
