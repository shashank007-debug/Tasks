package com.xworkz.overrideToString.internal;

public class Toaster {
    private String brand;
    private String model;
    private int slots;

    public Toaster(String brand, String model, int slots) {
        this.brand = brand;
        this.model = model;
        this.slots = slots;
    }

    @Override
    public String toString() {
        return "Toaster [brand=" + brand + ", model=" + model + ", slots=" + slots + "]";
    }
}
