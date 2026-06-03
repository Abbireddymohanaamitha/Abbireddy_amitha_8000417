package com.practice.basics;

/**
 * 30. Pattern Matching for Switch (Java 21)
 * Demonstrates a modern switch expression that matches by type.
 */
public class PatternMatchingDemo {
    public static void main(String[] args) {
        Object[] values = {42, "Java 21", 3.14, true};

        for (Object value : values) {
            System.out.println(describeValue(value));
        }
    }

    public static String describeValue(Object value) {
        return switch (value) {
            case Integer i -> "Integer value: " + i;
            case String s -> "String value: '" + s + "'";
            case Double d -> "Double value: " + d;
            case Boolean b -> "Boolean value: " + b;
            default -> "Unknown type: " + value;
        };
    }
}
