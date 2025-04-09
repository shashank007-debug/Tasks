package com.xworkz.overrideToString.internal;

public class Kettlebell {
    private String brand;
    private String model;
    private int weight;

    public Kettlebell(String brand, String model, int weight) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Kettlebell [brand=" + brand + ", model=" + model + ", weight=" + weight + "lbs]";
    }
}