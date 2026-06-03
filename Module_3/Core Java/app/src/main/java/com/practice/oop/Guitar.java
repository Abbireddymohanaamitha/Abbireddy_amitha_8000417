package com.practice.oop;

/**
 * Guitar implements Playable interface.
 */
public class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Strumming the guitar: 🎸");
    }
}
