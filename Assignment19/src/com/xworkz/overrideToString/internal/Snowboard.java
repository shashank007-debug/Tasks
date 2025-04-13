package com.xworkz.overrideToString.internal;

public class Snowboard {
    private String brand;
    private String model;
    private int length;

    public Snowboard(String brand, String model, int length) {
        this.brand = brand;
        this.model = model;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Snowboard [brand=" + brand + ", model=" + model + ", length=" + length + "cm]";
    }

    @Override
    public int hashCode() {
        return 75;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Snowboard) {
                Snowboard other = (Snowboard) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.length == other.length;
            }
        }
        return false;
    }
}
