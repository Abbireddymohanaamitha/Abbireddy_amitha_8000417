package com.practice.basics;

/**
 * 8. Operator Precedence
 * Demonstrates how Java evaluates arithmetic expressions.
 */
public class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        int result1 = 5 + 3 * 2;
        int result2 = (5 + 3) * 2;
        int result3 = 10 / 2 + 3;

        System.out.println("5 + 3 * 2 = " + result1);
        System.out.println("(5 + 3) * 2 = " + result2);
        System.out.println("10 / 2 + 3 = " + result3);
        System.out.println("Note: multiplication and division have higher precedence than addition.");
    }
}
