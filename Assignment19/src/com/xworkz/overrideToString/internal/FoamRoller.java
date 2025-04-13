package com.xworkz.overrideToString.internal;

public class FoamRoller {
    private String brand;
    private String model;
    private String density;

    public FoamRoller(String brand, String model, String density) {
        this.brand = brand;
        this.model = model;
        this.density = density;
    }

    @Override
    public String toString() {
        return "FoamRoller [brand=" + brand + ", model=" + model + ", density=" + density + "]";
    }

    @Override
    public int hashCode() {
        return 34;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof FoamRoller) {
                FoamRoller other = (FoamRoller) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
