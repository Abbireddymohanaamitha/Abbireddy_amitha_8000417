package com.practice.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 41. Executor Service and Callable
 * Demonstrates using an executor service with callable tasks.
 */
public class ExecutorCallableDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Callable<Integer>> tasks = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            int value = i;
            tasks.add(() -> value * value);
        }

        try {
            List<Future<Integer>> results = executor.invokeAll(tasks);
            System.out.println("Callable results:");
            for (Future<Integer> future : results) {
                System.out.println(future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Task execution failed: " + e.getMessage());
            Thread.currentThread().interrupt();
        } finally {
            executor.shutdown();
        }
    }
}
