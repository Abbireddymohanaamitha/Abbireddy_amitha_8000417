package com.practice.oop;

/**
 * Base class used for inheritance demonstration.
 */
public class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }
}
