package com.xworkz.overrideToString.internal;

public class YogaMat {
    private String brand;
    private String model;
    private double thickness;

    public YogaMat(String brand, String model, double thickness) {
        this.brand = brand;
        this.model = model;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "YogaMat [brand=" + brand + ", model=" + model + ", thickness=" + thickness + "mm]";
    }

    @Override
    public int hashCode() {
        return 31 * brand.hashCode() + 17 * model.hashCode() + 13 * Double.hashCode(thickness);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof YogaMat) {
            YogaMat other = (YogaMat) obj;
            return this.brand.equals(other.brand) && this.model.equals(other.model) && this.thickness == other.thickness;
        }
        return false;
    }
}
