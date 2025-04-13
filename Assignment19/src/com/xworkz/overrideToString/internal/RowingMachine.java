package com.xworkz.overrideToString.internal;

public class RowingMachine {
    private String brand;
    private String model;
    private String resistanceType;

    public RowingMachine(String brand, String model, String resistanceType) {
        this.brand = brand;
        this.model = model;
        this.resistanceType = resistanceType;
    }

    @Override
    public String toString() {
        return "RowingMachine [brand=" + brand + ", model=" + model + ", resistanceType=" + resistanceType + "]";
    }

    @Override
    public int hashCode() {
        return 68;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof RowingMachine) {
                RowingMachine other = (RowingMachine) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.resistanceType.equals(other.resistanceType);
            }
        }
        return false;
    }
}
