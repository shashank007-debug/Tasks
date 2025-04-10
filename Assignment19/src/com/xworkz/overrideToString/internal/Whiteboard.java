package com.xworkz.overrideToString.internal;

public class Whiteboard {
    private String brand;
    private String model;
    private int size;

    public Whiteboard(String brand, String model, int size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Whiteboard [brand=" + brand + ", model=" + model + ", size=" + size + "in]";
    }
    @Override
    public int hashCode() {
        return 97;
    }
}
