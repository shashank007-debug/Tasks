package com.xworkz.overrideToString.internal;

public class RowingMachine {
    private String brand;
    private String model;
    private String resistanceType;

    public RowingMachine(String brand, String model, String resistanceType) {
        this.brand = brand;
        this.model = model;
        this.resistanceType = resistanceType;
    }

    @Override
    public String toString() {
        return "RowingMachine [brand=" + brand + ", model=" + model + ", resistanceType=" + resistanceType + "]";
    }
}
