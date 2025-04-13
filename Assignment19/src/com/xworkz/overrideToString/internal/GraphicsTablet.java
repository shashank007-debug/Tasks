package com.xworkz.overrideToString.internal;

public class GraphicsTablet {
    private String brand;
    private String model;
    private String size;

    public GraphicsTablet(String brand, String model, String size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "GraphicsTablet [brand=" + brand + ", model=" + model + ", size=" + size + "]";
    }

    @Override
    public int hashCode() {
        return 40;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof GraphicsTablet) {
                GraphicsTablet other = (GraphicsTablet) obj;
                return this.brand.equals(other.brand) && this.model.equals(other.model);
            }
        }
        return false;
    }
}
