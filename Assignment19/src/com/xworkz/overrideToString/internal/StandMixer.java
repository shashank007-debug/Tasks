package com.xworkz.overrideToString.internal;

public class StandMixer {
    private String brand;
    private String model;
    private float speedSettings;

    public StandMixer(String brand, String model, float speedSettings) {
        this.brand = brand;
        this.model = model;
        this.speedSettings = speedSettings;
    }

    @Override
    public String toString() {
        return "StandMixer [brand=" + brand + ", model=" + model + ", speedSettings=" + speedSettings + "]";
    }

    @Override
    public int hashCode() {
        return 76;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof StandMixer) {
                StandMixer other = (StandMixer) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.speedSettings == other.speedSettings;
            }
        }
        return false;
    }
}
