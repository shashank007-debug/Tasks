package com.xworkz.overrideToString.internal;

public class YogaBlock {
    private String brand;
    private String model;
    private String material;

    public YogaBlock(String brand, String model, String material) {
        this.brand = brand;
        this.model = model;
        this.material = material;
    }

    @Override
    public String toString() {
        return "YogaBlock [brand=" + brand + ", model=" + model + ", material=" + material + "]";
    }
}
