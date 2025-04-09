package com.xworkz.overrideToString.internal;

public class FountainPen {
    private String brand;
    private String model;
    private String nibSize;

    public FountainPen(String brand, String model, String nibSize) {
        this.brand = brand;
        this.model = model;
        this.nibSize = nibSize;
    }

    @Override
    public String toString() {
        return "FountainPen [brand=" + brand + ", model=" + model + ", nibSize=" + nibSize + "]";
    }
}
