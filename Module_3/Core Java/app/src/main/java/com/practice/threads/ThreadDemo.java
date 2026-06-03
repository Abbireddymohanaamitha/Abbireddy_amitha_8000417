package com.practice.threads;

/**
 * 26. Thread Creation
 * Demonstrates creating and starting a traditional Java thread.
 */
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new MessageThread("Hello from a traditional thread!");
        thread.start();
        thread.join();
        System.out.println("Traditional thread completed.");
    }
}
