package com.xworkz.overrideToString.internal;

public class ResistanceBands {
    private String brand;
    private String model;
    private int resistanceLevels;

    public ResistanceBands(String brand, String model, int resistanceLevels) {
        this.brand = brand;
        this.model = model;
        this.resistanceLevels = resistanceLevels;
    }

    @Override
    public String toString() {
        return "ResistanceBands [brand=" + brand + ", model=" + model + ", resistanceLevels=" + resistanceLevels + "]";
    }
}
