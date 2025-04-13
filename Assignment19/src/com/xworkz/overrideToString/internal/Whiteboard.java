package com.xworkz.overrideToString.internal;

public class Whiteboard {
    private String brand;
    private String model;
    private int size;

    public Whiteboard(String brand, String model, int size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Whiteboard [brand=" + brand + ", model=" + model + ", size=" + size + "in]";
    }

    @Override
    public int hashCode() {
        return 31 * brand.hashCode() + 17 * model.hashCode() + 13 * Integer.hashCode(size);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Whiteboard) {
            Whiteboard other = (Whiteboard) obj;
            return this.brand.equals(other.brand) && this.model.equals(other.model) && this.size == other.size;
        }
        return false;
    }
}
