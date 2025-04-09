package com.xworkz.overrideToString.internal;

public class DumbbellSet {
    private String brand;
    private String model;
    private double maxWeight;

    public DumbbellSet(String brand, String model, double maxWeight) {
        this.brand = brand;
        this.model = model;
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "DumbbellSet [brand=" + brand + ", model=" + model + ", maxWeight=" + maxWeight + "lbs]";
    }
}
