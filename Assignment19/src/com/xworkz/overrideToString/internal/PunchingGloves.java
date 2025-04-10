package com.xworkz.overrideToString.internal;

public class PunchingGloves {
    private String brand;
    private String model;
    private int size;

    public PunchingGloves(String brand, String model, int size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "PunchingGloves [brand=" + brand + ", model=" + model + ", size=" + size + "oz]";
    }
    @Override
    public int hashCode() {
        return 62;
    }
}
