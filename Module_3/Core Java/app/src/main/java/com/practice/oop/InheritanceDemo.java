package com.practice.oop;

/**
 * 18. Inheritance Example
 * Demonstrates polymorphism and overridden methods.
 */
public class InheritanceDemo {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Creature");
        Animal dog = new Dog("Buddy");

        genericAnimal.makeSound();
        dog.makeSound();
        System.out.println("Concepts: inheritance, method overriding, polymorphism.");
    }
}
