package com.xworkz.overrideToString.internal;

public class Dumbbell {
    private String brand;
    private String model;
    private int weight;

    public Dumbbell(String brand, String model, int weight) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dumbbell [brand=" + brand + ", model=" + model + ", weight=" + weight + "lbs]";
    }
}