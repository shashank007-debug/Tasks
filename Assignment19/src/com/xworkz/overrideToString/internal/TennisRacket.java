package com.xworkz.overrideToString.internal;

public class TennisRacket {
    private String brand;
    private String model;
    private int headSize;

    public TennisRacket(String brand, String model, int headSize) {
        this.brand = brand;
        this.model = model;
        this.headSize = headSize;
    }

    @Override
    public String toString() {
        return "TennisRacket [brand=" + brand + ", model=" + model + ", headSize=" + headSize + "sq in]";
    }

    @Override
    public int hashCode() {
        return 82;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof TennisRacket) {
                TennisRacket other = (TennisRacket) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) && this.headSize == other.headSize;
            }
        }
        return false;
    }
}
