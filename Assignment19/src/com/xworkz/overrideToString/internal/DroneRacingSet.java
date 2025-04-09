package com.xworkz.overrideToString.internal;

public class DroneRacingSet {
    private String brand;
    private String model;
    private int maxSpeed;

    public DroneRacingSet(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "DroneRacingSet [brand=" + brand + ", model=" + model + ", maxSpeed=" + maxSpeed + "mph]";
    }
}
