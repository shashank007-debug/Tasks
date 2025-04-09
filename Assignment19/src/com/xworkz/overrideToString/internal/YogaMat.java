package com.xworkz.overrideToString.internal;

public class YogaMat {
    private String brand;
    private String model;
    private double thickness;

    public YogaMat(String brand, String model, double thickness) {
        this.brand = brand;
        this.model = model;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "YogaMat [brand=" + brand + ", model=" + model + ", thickness=" + thickness + "mm]";
    }
}