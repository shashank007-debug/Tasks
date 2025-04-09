package com.xworkz.overrideToString.internal;

public class FishingRod {
    private String brand;
    private String model;
    private int length;

    public FishingRod(String brand, String model, int length) {
        this.brand = brand;
        this.model = model;
        this.length = length;
    }

    @Override
    public String toString() {
        return "FishingRod [brand=" + brand + ", model=" + model + ", length=" + length + "ft]";
    }
}
