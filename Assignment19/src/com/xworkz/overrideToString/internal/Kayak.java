package com.xworkz.overrideToString.internal;

public class Kayak {
    private String brand;
    private String model;
    private int length;

    public Kayak(String brand, String model, int length) {
        this.brand = brand;
        this.model = model;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Kayak [brand=" + brand + ", model=" + model + ", length=" + length + "ft]";
    }
}
