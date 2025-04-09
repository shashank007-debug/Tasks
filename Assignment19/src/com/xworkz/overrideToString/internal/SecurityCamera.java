package com.xworkz.overrideToString.internal;

public class SecurityCamera {
    private String brand;
    private String model;
    private int resolution;

    public SecurityCamera(String brand, String model, int resolution) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "SecurityCamera [brand=" + brand + ", model=" + model + ", resolution=" + resolution + "p]";
    }
}
