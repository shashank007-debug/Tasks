package com.xworkz.overrideToString.internal;

public class GamingController {
    private String brand;
    private String model;
    private String type;

    public GamingController(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "GamingController [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
}
