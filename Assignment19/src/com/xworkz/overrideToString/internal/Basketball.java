package com.xworkz.overrideToString.internal;

public class Basketball {
    private String brand;
    private String model;
    private double circumference;

    public Basketball(String brand, String model, double circumference) {
        this.brand = brand;
        this.model = model;
        this.circumference = circumference;
    }

    @Override
    public String toString() {
        return "Basketball [brand=" + brand + ", model=" + model + ", circumference=" + circumference + "in]";
    }
    @Override
    public int hashCode() {
        return 6;
    }
}
