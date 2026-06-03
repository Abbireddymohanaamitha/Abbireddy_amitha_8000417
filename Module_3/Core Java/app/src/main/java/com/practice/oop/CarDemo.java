package com.practice.oop;

/**
 * Demonstrates creating an object from a class and calling methods.
 */
public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2024);
        car.start();
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
    }
}
