package com.xworkz.overrideToString.internal;

public class GolfClub {
    private String brand;
    private String model;
    private String type;

    public GolfClub(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "GolfClub [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }

    @Override
    public int hashCode() {
        return 39;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof GolfClub) {
                GolfClub other = (GolfClub) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
