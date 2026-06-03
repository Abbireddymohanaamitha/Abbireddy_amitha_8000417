package com.practice.oop;

/**
 * 17. Class and Object Creation
 * Car is a simple object model with state and behavior.
 */
public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void start() {
        System.out.println("Starting the " + year + " " + make + " " + model + ".");
    }
}
