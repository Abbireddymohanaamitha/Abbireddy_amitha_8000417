package com.practice.exceptions;

/**
 * 20. Try-Catch Example
 * Demonstrates handling runtime exceptions safely.
 */
public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int[] values = {1, 2, 3};
            System.out.println(values[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Caught exception: " + ex.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}
