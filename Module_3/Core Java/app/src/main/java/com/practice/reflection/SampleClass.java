package com.practice.reflection;

/**
 * Sample class used for reflection demonstration.
 */
public class SampleClass {
    private final String name;
    private int value;

    public SampleClass(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void greet() {
        System.out.println("Hello from " + name + "!");
    }

    public int multiply(int factor) {
        return value * factor;
    }
}
