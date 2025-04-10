package com.xworkz.overrideToString.internal;

public class SleepingBag {
    private String brand;
    private String model;
    private int temperatureRating;

    public SleepingBag(String brand, String model, int temperatureRating) {
        this.brand = brand;
        this.model = model;
        this.temperatureRating = temperatureRating;
    }

    @Override
    public String toString() {
        return "SleepingBag [brand=" + brand + ", model=" + model + ", temperatureRating=" + temperatureRating + "°F]";
    }
    @Override
    public int hashCode() {
        return 71;
    }
}
