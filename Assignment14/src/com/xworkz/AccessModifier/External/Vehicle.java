package com.xworkz.AccessModifier.External;

public class Vehicle {
    public String model;
    String type;
    private int wheels;

    public void drive() {
        this.wheels = 4;
        System.out.println("Driving the vehicle with " + this.wheels + " wheels.");
    }

    public void repair() {
        this.checkEngine();
        System.out.println("Vehicle is being repaired.");
    }

    private void checkEngine() {
        System.out.println("Checking the engine of the vehicle.");
    }
}
