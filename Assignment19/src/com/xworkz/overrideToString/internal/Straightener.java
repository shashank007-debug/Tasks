package com.xworkz.overrideToString.internal;

public class Straightener {
    private String brand;
    private String model;
    private double plateWidth;

    public Straightener(String brand, String model, double plateWidth) {
        this.brand = brand;
        this.model = model;
        this.plateWidth = plateWidth;
    }

    @Override
    public String toString() {
        return "Straightener [brand=" + brand + ", model=" + model + ", plateWidth=" + plateWidth + "in]";
    }
    @Override
    public int hashCode() {
        return 78;
    }
}