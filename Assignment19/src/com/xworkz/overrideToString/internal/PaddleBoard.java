package com.xworkz.overrideToString.internal;

public class PaddleBoard {
    private String brand;
    private String model;
    private int length;

    public PaddleBoard(String brand, String model, int length) {
        this.brand = brand;
        this.model = model;
        this.length = length;
    }

    @Override
    public String toString() {
        return "PaddleBoard [brand=" + brand + ", model=" + model + ", length=" + length + "ft]";
    }

    @Override
    public int hashCode() {
        return 56;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof PaddleBoard) {
                PaddleBoard other = (PaddleBoard) obj;
                return this.brand.equals(other.brand)&& this.length == other.length;
            }
        }
        return false;
    }
}
