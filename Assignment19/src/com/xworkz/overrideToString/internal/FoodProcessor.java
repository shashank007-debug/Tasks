package com.xworkz.overrideToString.internal;

public class FoodProcessor {
    private String brand;
    private String model;
    private int capacity;

    public FoodProcessor(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "FoodProcessor [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "cup]";
    }
}