package com.xworkz.overrideToString.internal;

public class GamingController {
    private String brand;
    private String model;
    private String type;

    public GamingController(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "GamingController [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }

    @Override
    public int hashCode() {
        return 38;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof GamingController) {
                GamingController other = (GamingController) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
