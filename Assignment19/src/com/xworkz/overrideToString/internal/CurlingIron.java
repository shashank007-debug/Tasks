package com.xworkz.overrideToString.internal;

public class CurlingIron {
    private String brand;
    private String model;
    private double barrelSize;

    public CurlingIron(String brand, String model, double barrelSize) {
        this.brand = brand;
        this.model = model;
        this.barrelSize = barrelSize;
    }

    @Override
    public String toString() {
        return "CurlingIron [brand=" + brand + ", model=" + model + ", barrelSize=" + barrelSize + "in]";
    }
    @Override
    public int hashCode() {
        return 18;
    }
}