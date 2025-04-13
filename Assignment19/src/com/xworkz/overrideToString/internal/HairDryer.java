package com.xworkz.overrideToString.internal;

public class HairDryer {
    private String brand;
    private String model;
    private int wattage;

    public HairDryer(String brand, String model, int wattage) {
        this.brand = brand;
        this.model = model;
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "HairDryer [brand=" + brand + ", model=" + model + ", wattage=" + wattage + "W]";
    }

    @Override
    public int hashCode() {
        return 42;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof HairDryer) {
                HairDryer other = (HairDryer) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
