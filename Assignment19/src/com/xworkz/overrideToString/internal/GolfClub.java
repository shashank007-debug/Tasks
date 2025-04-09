package com.xworkz.overrideToString.internal;

public class GolfClub {
    private String brand;
    private String model;
    private String type;

    public GolfClub(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "GolfClub [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
}
