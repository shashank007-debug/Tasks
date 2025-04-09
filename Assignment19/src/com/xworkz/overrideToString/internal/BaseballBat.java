package com.xworkz.overrideToString.internal;

public class BaseballBat {
    private String brand;
    private String model;
    private int length;

    public BaseballBat(String brand, String model, int length) {
        this.brand = brand;
        this.model = model;
        this.length = length;
    }

    @Override
    public String toString() {
        return "BaseballBat [brand=" + brand + ", model=" + model + ", length=" + length + "in]";
    }
}
