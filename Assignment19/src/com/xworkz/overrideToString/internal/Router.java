package com.xworkz.overrideToString.internal;

public class Router {
    private String brand;
    private String model;
    private String wifiStandard;

    public Router(String brand, String model, String wifiStandard) {
        this.brand = brand;
        this.model = model;
        this.wifiStandard = wifiStandard;
    }

    @Override
    public String toString() {
        return "Router [brand=" + brand + ", model=" + model + ", wifiStandard=" + wifiStandard + "]";
    }

    @Override
    public int hashCode() {
        return 67;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Router) {
                Router other = (Router) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.wifiStandard.equals(other.wifiStandard);
            }
        }
        return false;
    }
}
