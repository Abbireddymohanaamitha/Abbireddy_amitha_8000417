package com.practice.bytecode;

/**
 * 37. Using javap to Inspect Bytecode
 * A simple class whose compiled bytecode can be inspected with javap.
 */
public class BytecodeDemo {
    public static void main(String[] args) {
        int result = multiply(6, 7);
        System.out.println("6 * 7 = " + result);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
