package com.practice.oop;

/**
 * Piano implements Playable interface.
 */
public class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano keys: 🎹");
    }
}
