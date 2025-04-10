package com.xworkz.overrideToString.internal;

public class CampingStove {
    private String brand;
    private String model;
    private int burners;

    public CampingStove(String brand, String model, int burners) {
        this.brand = brand;
        this.model = model;
        this.burners = burners;
    }

    @Override
    public String toString() {
        return "CampingStove [brand=" + brand + ", model=" + model + ", burners=" + burners + "]";
    }
    @Override
    public int hashCode() {
        return 14;
    }
}
