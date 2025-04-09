package com.xworkz.overrideToString.internal;

public class FlashDrive {
    private String brand;
    private String model;
    private int capacity;

    public FlashDrive(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "FlashDrive [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "GB]";
    }
}
