package com.xworkz.overrideToString.internal;

public class Toothbrush {
    private String brand;
    private String model;
    private String type;

    public Toothbrush(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Toothbrush [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
}
