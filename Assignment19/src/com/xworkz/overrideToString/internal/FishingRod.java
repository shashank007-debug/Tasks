package com.xworkz.overrideToString.internal;

public class FishingRod {
    private String brand;
    private String model;
    private int length;

    public FishingRod(String brand, String model, int length) {
        this.brand = brand;
        this.model = model;
        this.length = length;
    }

    @Override
    public String toString() {
        return "FishingRod [brand=" + brand + ", model=" + model + ", length=" + length + "ft]";
    }

    @Override
    public int hashCode() {
        return 32;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof FishingRod) {
                FishingRod other = (FishingRod) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
