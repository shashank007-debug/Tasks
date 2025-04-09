package com.xworkz.overrideToString.internal;

public class RCcar {
    private String brand;
    private String model;
    private String powerSource;

    public RCcar(String brand, String model, String powerSource) {
        this.brand = brand;
        this.model = model;
        this.powerSource = powerSource;
    }

    @Override
    public String toString() {
        return "RCcar [brand=" + brand + ", model=" + model + ", powerSource=" + powerSource + "]";
    }
}
