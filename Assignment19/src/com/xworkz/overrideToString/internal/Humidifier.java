package com.xworkz.overrideToString.internal;

public class Humidifier {
    private String brand;
    private String model;
    private double tankSize;

    public Humidifier(String brand, String model, double tankSize) {
        this.brand = brand;
        this.model = model;
        this.tankSize = tankSize;
    }

    @Override
    public String toString() {
        return "Humidifier [brand=" + brand + ", model=" + model + ", tankSize=" + tankSize + "L]";
    }
    @Override
    public int hashCode() {
        return 45;
    }
}
