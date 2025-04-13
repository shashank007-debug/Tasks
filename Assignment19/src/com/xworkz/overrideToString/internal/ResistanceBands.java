package com.xworkz.overrideToString.internal;

public class ResistanceBands {
    private String brand;
    private String model;
    private int resistanceLevels;

    public ResistanceBands(String brand, String model, int resistanceLevels) {
        this.brand = brand;
        this.model = model;
        this.resistanceLevels = resistanceLevels;
    }

    @Override
    public String toString() {
        return "ResistanceBands [brand=" + brand + ", model=" + model + ", resistanceLevels=" + resistanceLevels + "]";
    }

    @Override
    public int hashCode() {
        return 65;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof ResistanceBands) {
                ResistanceBands other = (ResistanceBands) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.resistanceLevels == other.resistanceLevels;
            }
        }
        return false;
    }
}
