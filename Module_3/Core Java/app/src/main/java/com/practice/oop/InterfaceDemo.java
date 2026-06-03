package com.practice.oop;

/**
 * 19. Interface Implementation
 * Demonstrates using interfaces to define contracts.
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        guitar.play();
        piano.play();
        System.out.println("Interfaces allow multiple implementations under a common contract.");
    }
}
