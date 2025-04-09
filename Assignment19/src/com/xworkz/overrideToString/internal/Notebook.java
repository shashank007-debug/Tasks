package com.xworkz.overrideToString.internal;

public class Notebook {
    private String brand;
    private String model;
    private int pageCount;

    public Notebook(String brand, String model, int pageCount) {
        this.brand = brand;
        this.model = model;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return "Notebook [brand=" + brand + ", model=" + model + ", pageCount=" + pageCount + "]";
    }
}
