package com.xworkz.overrideToString.internal;

public class Suitcase {
    private String brand;
    private String model;
    private int capacity;

    public Suitcase(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Suitcase [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "L]";
    }
    @Override
    public int hashCode() {
        return 79;
    }
}
