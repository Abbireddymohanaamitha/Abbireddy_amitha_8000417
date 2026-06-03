package com.practice.collections;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 28. Stream API
 * Demonstrates Java Stream operations on collections.
 */
public class StreamApiDemo {
    public static void main(String[] args) {
        List<String> values = List.of("apple", "banana", "cherry", "avocado");

        List<String> filtered = values.stream()
                .filter(value -> value.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Filtered values starting with 'a': " + filtered);
        System.out.println("Time complexity: O(n) for a single stream pass.");
    }
}
