package com.xworkz.overrideToString.internal;

public class Treadmill {
    private String brand;
    private String model;
    private double maxSpeed;

    public Treadmill(String brand, String model, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Treadmill [brand=" + brand + ", model=" + model + ", maxSpeed=" + maxSpeed + "mph]";
    }
}
