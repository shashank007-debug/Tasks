package com.xworkz.overrideToString.internal;

public class Cooler {
    private String brand;
    private String model;
    private int capacity;

    public Cooler(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Cooler [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "qt]";
    }
    @Override
    public int hashCode() {
        return 17;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Cooler ){
                 Cooler obj1 = this;
                 Cooler obj2 =  (Cooler) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
