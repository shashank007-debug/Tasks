package com.xworkz.overrideToString.internal;

public class Elliptical {
    private String brand;
    private String model;
    private int resistanceLevels;

    public Elliptical(String brand, String model, int resistanceLevels) {
        this.brand = brand;
        this.model = model;
        this.resistanceLevels = resistanceLevels;
    }

    @Override
    public String toString() {
        return "Elliptical [brand=" + brand + ", model=" + model + ", resistanceLevels=" + resistanceLevels + "]";
    }
}
