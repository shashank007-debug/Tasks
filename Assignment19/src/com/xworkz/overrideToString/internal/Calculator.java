package com.xworkz.overrideToString.internal;

public class Calculator {
    private String brand;
    private String model;
    private String type;

    public Calculator(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Calculator [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
}
