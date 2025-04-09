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
}
