package com.xworkz.overrideToString.internal;

public class Backpack {
    private String brand;
    private String model;
    private int capacity;

    public Backpack(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Backpack [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "L]";
    }
    @Override
    public int hashCode() {
        return 4;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Backpack){
                Backpack backpack1 = this;
                Backpack backpack2 = (Backpack) obj;
                return (backpack1.model.equals(backpack2.model));
            }
        }
        return false;
    }
}
