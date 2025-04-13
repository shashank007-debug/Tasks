package com.xworkz.overrideToString.internal;

public class SmartThermostat {
    private String brand;
    private String model;
    private String connectivity;

    public SmartThermostat(String brand, String model, String connectivity) {
        this.brand = brand;
        this.model = model;
        this.connectivity = connectivity;
    }

    @Override
    public String toString() {
        return "SmartThermostat [brand=" + brand + ", model=" + model + ", connectivity=" + connectivity + "]";
    }

    @Override
    public int hashCode() {
        return 74;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof SmartThermostat) {
                SmartThermostat other = (SmartThermostat) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.connectivity.equals(other.connectivity);
            }
        }
        return false;
    }
}
