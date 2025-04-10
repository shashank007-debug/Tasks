package com.xworkz.overrideToString.internal;

public class DeskLamp {
    private String brand;
    private String model;
    private String type;

    public DeskLamp(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "DeskLamp [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
    @Override
    public int hashCode() {
        return 19;
    }
}
