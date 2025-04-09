package com.xworkz.overrideToString.internal;

public class Guitar {
    private String brand;
    private String model;
    private int strings;

    public Guitar(String brand, String model, int strings) {
        this.brand = brand;
        this.model = model;
        this.strings = strings;
    }

    @Override
    public String toString() {
        return "Guitar [brand=" + brand + ", model=" + model + ", strings=" + strings + "]";
    }
}