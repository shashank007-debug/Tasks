package com.xworkz.overrideToString.internal;

public class RiceCooker {
    private String brand;
    private String model;
    private double capacity;

    public RiceCooker(String brand, String model, double capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "RiceCooker [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "cup]";
    }
}
