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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof PaperShredder) {
                PaperShredder other = (PaperShredder) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model) ;
            }
        }
        return false;
    }
}
