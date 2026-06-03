package com.practice.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 24. ArrayList Example
 * Demonstrates dynamic arrays using ArrayList.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");

        System.out.println("Cities:");
        for (String city : cities) {
            System.out.println("- " + city);
        }
        System.out.println("ArrayList size: " + cities.size());
        System.out.println("Time complexity: O(n) to iterate, O(1) average for add operations.");
    }
}
