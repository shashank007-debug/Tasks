package com.xworkz.overrideToString.internal;

public class Binoculars {
    private String brand;
    private String model;
    private int magnification;

    public Binoculars(String brand, String model, int magnification) {
        this.brand = brand;
        this.model = model;
        this.magnification = magnification;
    }

    @Override
    public String toString() {
        return "Binoculars [brand=" + brand + ", model=" + model + ", magnification=" + magnification + "x]";
    }
}
