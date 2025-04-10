package com.xworkz.overrideToString.internal;

public class VacuumCleaner {
    private String brand;
    private String model;
    private String type;

    public VacuumCleaner(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "VacuumCleaner [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }
    @Override
    public int hashCode() {
        return 89;
    }
}
