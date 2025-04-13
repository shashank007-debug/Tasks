package com.xworkz.overrideToString.internal;

public class YogaBlock {
    private String brand;
    private String model;
    private String material;

    public YogaBlock(String brand, String model, String material) {
        this.brand = brand;
        this.model = model;
        this.material = material;
    }

    @Override
    public String toString() {
        return "YogaBlock [brand=" + brand + ", model=" + model + ", material=" + material + "]";
    }

    @Override
    public int hashCode() {
        return 31 * brand.hashCode() + 17 * model.hashCode() + 13 * material.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof YogaBlock) {
            YogaBlock other = (YogaBlock) obj;
            return this.brand.equals(other.brand) && this.model.equals(other.model) && this.material.equals(other.material);
        }
        return false;
    }
}
