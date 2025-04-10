package com.xworkz.overrideToString.internal;

public class Snowboard {
    private String brand;
    private String model;
    private int length;

    public Snowboard(String brand, String model, int length) {
        this.brand = brand;
        this.model = model;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Snowboard [brand=" + brand + ", model=" + model + ", length=" + length + "cm]";
    }
    @Override
    public int hashCode() {
        return 75;
    }
}
