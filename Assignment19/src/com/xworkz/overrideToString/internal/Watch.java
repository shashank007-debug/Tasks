package com.xworkz.overrideToString.internal;

public class Watch {
    private String brand;
    private String model;
    private String movementType;

    public Watch(String brand, String model, String movementType) {
        this.brand = brand;
        this.model = model;
        this.movementType = movementType;
    }

    @Override
    public String toString() {
        return "Watch [brand=" + brand + ", model=" + model + ", movementType=" + movementType + "]";
    }

    @Override
    public int hashCode() {
        return 92;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Watch) {
                Watch other = (Watch) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.movementType.equals(other.movementType);
            }
        }
        return false;
    }
}
