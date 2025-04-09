package com.xworkz.overrideToString.internal;

public class GamingConsole {
    private String brand;
    private String model;
    private String type;

    public GamingConsole(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "GamingConsole [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
}
