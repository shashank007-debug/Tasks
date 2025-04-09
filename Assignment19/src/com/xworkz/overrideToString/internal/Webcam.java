package com.xworkz.overrideToString.internal;

public class Webcam {
    private String brand;
    private String model;
    private int resolution;

    public Webcam(String brand, String model, int resolution) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Webcam [brand=" + brand + ", model=" + model + ", resolution=" + resolution + "p]";
    }
}
