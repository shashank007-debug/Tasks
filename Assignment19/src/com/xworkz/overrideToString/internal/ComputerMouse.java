package com.xworkz.overrideToString.internal;

public class ComputerMouse {
    private String brand;
    private String model;
    private int dpi;

    public ComputerMouse(String brand, String model, int dpi) {
        this.brand = brand;
        this.model = model;
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "ComputerMouse [brand=" + brand + ", model=" + model + ", dpi=" + dpi + "]";
    }
    @Override
    public int hashCode() {
        return 16;
    }
}
