package com.practice.collections;

import java.util.Arrays;
import java.util.List;

/**
 * 27. Lambda Expressions
 * Demonstrates compact behavior via lambda expressions.
 */
public class LambdaDemo {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "Kotlin", "JavaScript");
        languages.forEach(language -> System.out.println("Language: " + language));
        System.out.println("Time complexity: O(n) for iteration.");
    }
}
