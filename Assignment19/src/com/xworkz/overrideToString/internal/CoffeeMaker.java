package com.xworkz.overrideToString.internal;

public class CoffeeMaker {
    private String brand;
    private String model;
    private int cupCapacity;

    public CoffeeMaker(String brand, String model, int cupCapacity) {
        this.brand = brand;
        this.model = model;
        this.cupCapacity = cupCapacity;
    }

    @Override
    public String toString() {
        return "CoffeeMaker [brand=" + brand + ", model=" + model + ", cupCapacity=" + cupCapacity + "]";
    }
    @Override
    public int hashCode() {
        return 15;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof CoffeeMaker){
                CoffeeMaker obj1 = this;
                CoffeeMaker obj2 = (CoffeeMaker) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
