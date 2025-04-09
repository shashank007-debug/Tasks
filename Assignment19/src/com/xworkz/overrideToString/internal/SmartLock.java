package com.xworkz.overrideToString.internal;

public class SmartLock {
    private String brand;
    private String model;
    private String type;

    public SmartLock(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "SmartLock [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
}
