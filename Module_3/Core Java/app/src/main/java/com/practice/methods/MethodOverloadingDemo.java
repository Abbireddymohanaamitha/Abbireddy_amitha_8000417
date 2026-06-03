package com.practice.methods;

/**
 * 12. Method Overloading
 * Demonstrates the same method name with different parameter lists.
 */
public class MethodOverloadingDemo {
    public static void main(String[] args) {
        System.out.println("Sum of two ints: " + add(4, 6));
        System.out.println("Sum of three ints: " + add(4, 6, 8));
        System.out.println("Concatenate two strings: " + add("Hello", "World"));
        System.out.println("Time complexity: O(1) for each overloaded call.");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static String add(String first, String second) {
        return first + " " + second;
    }
}
