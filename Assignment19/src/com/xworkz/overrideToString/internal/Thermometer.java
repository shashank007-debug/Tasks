package com.xworkz.overrideToString.internal;

public class Thermometer {
    private String brand;
    private String model;
    private String type;

    public Thermometer(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Thermometer [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
}
