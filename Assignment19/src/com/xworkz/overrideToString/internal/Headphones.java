package com.xworkz.overrideToString.internal;

public class Headphones {
    private String brand;
    private String model;
    private boolean wireless;

    public Headphones(String brand, String model, boolean wireless) {
        this.brand = brand;
        this.model = model;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Headphones [brand=" + brand + ", model=" + model + ", wireless=" + wireless + "]";
    }
}
