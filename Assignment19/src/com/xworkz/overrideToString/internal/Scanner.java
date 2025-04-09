package com.xworkz.overrideToString.internal;

public class Scanner {
    private String brand;
    private String model;
    private String type;

    public Scanner(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Scanner [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
}
