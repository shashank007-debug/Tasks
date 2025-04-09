package com.xworkz.overrideToString.internal;

public class Cooler {
    private String brand;
    private String model;
    private int capacity;

    public Cooler(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Cooler [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "qt]";
    }
}
