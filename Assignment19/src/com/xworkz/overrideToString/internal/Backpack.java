package com.xworkz.overrideToString.internal;

public class Backpack {
    private String brand;
    private String model;
    private int capacity;

    public Backpack(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Backpack [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "L]";
    }
}
