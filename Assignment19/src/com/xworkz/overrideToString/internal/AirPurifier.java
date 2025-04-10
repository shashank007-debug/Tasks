package com.xworkz.overrideToString.internal;

public class AirPurifier {
    private String brand;
    private String model;
    private int coverageArea;

    public AirPurifier(String brand, String model, int coverageArea) {
        this.brand = brand;
        this.model = model;
        this.coverageArea = coverageArea;
    }

    @Override
    public String toString() {
        return "AirPurifier [brand=" + brand + ", model=" + model + ", coverageArea=" + coverageArea + "sq ft]";
    }
    @Override
    public int hashCode() {
        return 3;
    }
}
