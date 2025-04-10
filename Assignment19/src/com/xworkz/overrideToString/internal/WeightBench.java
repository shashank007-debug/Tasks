package com.xworkz.overrideToString.internal;

public class WeightBench {
    private String brand;
    private String model;
    private String type;

    public WeightBench(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "WeightBench [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
    @Override
    public int hashCode() {
        return 96;
    }
}
