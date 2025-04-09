package com.xworkz.overrideToString.internal;

public class Briefcase {
    private String brand;
    private String model;
    private String material;

    public Briefcase(String brand, String model, String material) {
        this.brand = brand;
        this.model = model;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Briefcase [brand=" + brand + ", model=" + model + ", material=" + material + "]";
    }
}
