package com.practice.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * 25. HashMap Example
 * Demonstrates key-value storage using HashMap.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Apples", 10);
        inventory.put("Bananas", 5);
        inventory.put("Oranges", 12);

        inventory.put("Apples", inventory.get("Apples") + 3); // update quantity

        System.out.println("Inventory:");
        inventory.forEach((item, count) -> System.out.println(item + ": " + count));
        System.out.println("Time complexity: O(1) average for get/put operations.");
    }
}
