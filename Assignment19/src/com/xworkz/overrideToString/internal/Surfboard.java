package com.xworkz.overrideToString.internal;

public class Surfboard {
    private String brand;
    private String model;
    private double length;

    public Surfboard(String brand, String model, double length) {
        this.brand = brand;
        this.model = model;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Surfboard [brand=" + brand + ", model=" + model + ", length=" + length + "ft]";
    }
}
