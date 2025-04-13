package com.xworkz.overrideToString.internal;

public class Straightener {
    private String brand;
    private String model;
    private double plateWidth;

    public Straightener(String brand, String model, double plateWidth) {
        this.brand = brand;
        this.model = model;
        this.plateWidth = plateWidth;
    }

    @Override
    public String toString() {
        return "Straightener [brand=" + brand + ", model=" + model + ", plateWidth=" + plateWidth + "in]";
    }

    @Override
    public int hashCode() {
        return 78;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Straightener) {
                Straightener other = (Straightener) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.plateWidth == other.plateWidth;
            }
        }
        return false;
    }
}
