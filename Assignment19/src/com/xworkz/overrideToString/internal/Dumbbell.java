package com.xworkz.overrideToString.internal;

public class Dumbbell {
    private String brand;
    private String model;
    private int weight;

    public Dumbbell(String brand, String model, int weight) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dumbbell [brand=" + brand + ", model=" + model + ", weight=" + weight + "lbs]";
    }
    @Override
    public int hashCode() {
        return 22;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Dumbbell){
                Dumbbell obj1 = this;
                Dumbbell obj2 = (Dumbbell) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}