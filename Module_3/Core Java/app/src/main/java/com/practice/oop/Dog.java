package com.practice.oop;

/**
 * Derived class that extends Animal and overrides behavior.
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof!");
    }
}
