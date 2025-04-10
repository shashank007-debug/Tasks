package com.xworkz.overrideToString.internal;

public class ExerciseBike {
    private String brand;
    private String model;
    private double screenSize;

    public ExerciseBike(String brand, String model, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "ExerciseBike [brand=" + brand + ", model=" + model + ", screenSize=" + screenSize + "in]";
    }
    @Override
    public int hashCode() {
        return 29;
    }
}
