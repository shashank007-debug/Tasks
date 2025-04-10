package com.xworkz.overrideToString.internal;

public class Juicer {
    private String brand;
    private String model;
    private String type;

    public Juicer(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Juicer [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
    @Override
    public int hashCode() {
        return 46;
    }
}
