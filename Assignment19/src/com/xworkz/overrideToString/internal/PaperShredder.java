package com.xworkz.overrideToString.internal;

public class PaperShredder {
    private String brand;
    private String model;
    private int sheetCapacity;

    public PaperShredder(String brand, String model, int sheetCapacity) {
        this.brand = brand;
        this.model = model;
        this.sheetCapacity = sheetCapacity;
    }

    @Override
    public String toString() {
        return "PaperShredder [brand=" + brand + ", model=" + model + ", sheetCapacity=" + sheetCapacity + "]";
    }
    @Override
    public int hashCode() {
        return 57;
    }
}
