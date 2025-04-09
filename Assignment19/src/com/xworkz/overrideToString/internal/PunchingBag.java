package com.xworkz.overrideToString.internal;

public class PunchingBag {
    private String brand;
    private String model;
    private int weight;

    public PunchingBag(String brand, String model, int weight) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PunchingBag [brand=" + brand + ", model=" + model + ", weight=" + weight + "lbs]";
    }
}
