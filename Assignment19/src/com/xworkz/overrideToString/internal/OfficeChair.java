package com.xworkz.overrideToString.internal;

public class OfficeChair {
    private String brand;
    private String model;
    private String material;

    public OfficeChair(String brand, String model, String material) {
        this.brand = brand;
        this.model = model;
        this.material = material;
    }

    @Override
    public String toString() {
        return "OfficeChair [brand=" + brand + ", model=" + model + ", material=" + material + "]";
    }

    @Override
    public int hashCode() {
        return 55;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof OfficeChair) {
                OfficeChair other = (OfficeChair) obj;
                return this.brand.equals(other.brand)&& this.material.equals(other.material);
            }
        }
        return false;
    }
}
