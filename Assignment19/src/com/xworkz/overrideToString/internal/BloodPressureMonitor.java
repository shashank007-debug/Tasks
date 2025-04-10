package com.xworkz.overrideToString.internal;

public class BloodPressureMonitor {
    private String brand;
    private String model;
    private String type;

    public BloodPressureMonitor(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "BloodPressureMonitor [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }

    @Override
    public int hashCode() {
        return 9;
    }
}
