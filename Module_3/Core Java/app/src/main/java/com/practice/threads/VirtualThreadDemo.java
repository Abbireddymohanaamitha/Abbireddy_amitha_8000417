package com.practice.threads;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * 40. Virtual Threads (Java 21)
 * Creates 100,000 virtual threads and measures execution time.
 */
public class VirtualThreadDemo {
    public static void main(String[] args) {
        int threads = 100_000;
        List<Thread> virtualThreads = new ArrayList<>(threads);
        Instant start = Instant.now();
        long memoryBefore = Runtime.getRuntime().freeMemory();

        for (int i = 0; i < threads; i++) {
            Thread vt = Thread.startVirtualThread(() -> {
                // lightweight task
                int sum = 0;
                for (int j = 0; j < 5; j++) {
                    sum += j;
                }
            });
            virtualThreads.add(vt);
        }

        virtualThreads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        long memoryAfter = Runtime.getRuntime().freeMemory();
        Instant end = Instant.now();
        System.out.println("Created " + threads + " virtual threads.");
        System.out.println("Execution time: " + Duration.between(start, end).toMillis() + " ms");
        System.out.println("Free memory before: " + memoryBefore);
        System.out.println("Free memory after: " + memoryAfter);
        System.out.println("Virtual threads are lightweight compared to traditional threads.");
    }
}
