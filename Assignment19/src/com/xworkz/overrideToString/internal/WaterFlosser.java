package com.xworkz.overrideToString.internal;

public class WaterFlosser {
    private String brand;
    private String model;
    private int pressureSettings;

    public WaterFlosser(String brand, String model, int pressureSettings) {
        this.brand = brand;
        this.model = model;
        this.pressureSettings = pressureSettings;
    }

    @Override
    public String toString() {
        return "WaterFlosser [brand=" + brand + ", model=" + model + ", pressureSettings=" + pressureSettings + "]";
    }

    @Override
    public int hashCode() {
        return 31 * brand.hashCode() + 17 * model.hashCode() + 13 * pressureSettings;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof WaterFlosser) {
            WaterFlosser other = (WaterFlosser) obj;
            return this.brand.equals(other.brand) && this.model.equals(other.model) && this.pressureSettings == other.pressureSettings;
        }
        return false;
    }
}
