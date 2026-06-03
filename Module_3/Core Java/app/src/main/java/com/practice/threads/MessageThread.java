package com.practice.threads;

/**
 * Simple thread subclass used by ThreadDemo.
 */
public class MessageThread extends Thread {
    private final String message;

    public MessageThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("MessageThread says: " + message);
    }
}
