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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof SleepingBag) {
                SleepingBag other = (SleepingBag) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.temperatureRating == other.temperatureRating;
            }
        }
        return false;
    }
}
