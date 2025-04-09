package com.xworkz.overrideToString.internal;

public class Keyboard {
    private String brand;
    private String model;
    private String type;

    public Keyboard(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Keyboard [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
}
