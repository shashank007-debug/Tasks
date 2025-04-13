package com.xworkz.overrideToString.internal;

public class RCcar {
    private String brand;
    private String model;
    private String powerSource;

    public RCcar(String brand, String model, String powerSource) {
        this.brand = brand;
        this.model = model;
        this.powerSource = powerSource;
    }

    @Override
    public String toString() {
        return "RCcar [brand=" + brand + ", model=" + model + ", powerSource=" + powerSource + "]";
    }

    @Override
    public int hashCode() {
        return 64;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof RCcar) {
                RCcar other = (RCcar) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.powerSource.equals(other.powerSource);
            }
        }
        return false;
    }
}
