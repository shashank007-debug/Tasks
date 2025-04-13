package com.xworkz.overrideToString.internal;

public class FishingReel {
    private String brand;
    private String model;
    private int gearRatio;

    public FishingReel(String brand, String model, int gearRatio) {
        this.brand = brand;
        this.model = model;
        this.gearRatio = gearRatio;
    }

    @Override
    public String toString() {
        return "FishingReel [brand=" + brand + ", model=" + model + ", gearRatio=" + gearRatio + ":1]";
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof FishingReel) {
                FishingReel other = (FishingReel) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
