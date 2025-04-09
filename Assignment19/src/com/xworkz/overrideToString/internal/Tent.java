package com.xworkz.overrideToString.internal;

public class Tent {
    private String brand;
    private String model;
    private int capacity;

    public Tent(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Tent [brand=" + brand + ", model=" + model + ", capacity=" + capacity + " people]";
    }
}
