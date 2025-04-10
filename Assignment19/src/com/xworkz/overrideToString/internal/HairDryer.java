package com.xworkz.overrideToString.internal;

public class HairDryer {
    private String brand;
    private String model;
    private int wattage;

    public HairDryer(String brand, String model, int wattage) {
        this.brand = brand;
        this.model = model;
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "HairDryer [brand=" + brand + ", model=" + model + ", wattage=" + wattage + "W]";
    }
    @Override
    public int hashCode() {
        return 42;
    }
}
