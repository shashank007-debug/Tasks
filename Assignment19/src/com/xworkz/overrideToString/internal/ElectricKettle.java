package com.xworkz.overrideToString.internal;

public class ElectricKettle {
    private String brand;
    private String model;
    private double capacity;

    public ElectricKettle(String brand, String model, double capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ElectricKettle [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "L]";
    }
    @Override
    public int hashCode() {
        return 25;
    }
}
