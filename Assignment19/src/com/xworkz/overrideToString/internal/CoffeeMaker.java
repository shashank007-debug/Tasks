package com.xworkz.overrideToString.internal;

public class CoffeeMaker {
    private String brand;
    private String model;
    private int cupCapacity;

    public CoffeeMaker(String brand, String model, int cupCapacity) {
        this.brand = brand;
        this.model = model;
        this.cupCapacity = cupCapacity;
    }

    @Override
    public String toString() {
        return "CoffeeMaker [brand=" + brand + ", model=" + model + ", cupCapacity=" + cupCapacity + "]";
    }
}
