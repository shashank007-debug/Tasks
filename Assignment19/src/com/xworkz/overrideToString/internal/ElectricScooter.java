package com.xworkz.overrideToString.internal;

public class ElectricScooter {
    private String brand;
    private String model;
    private double maxSpeed;

    public ElectricScooter(String brand, String model, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "ElectricScooter [brand=" + brand + ", model=" + model + ", maxSpeed=" + maxSpeed + "mph]";
    }
    @Override
    public int hashCode() {
        return 26;
    }
}
