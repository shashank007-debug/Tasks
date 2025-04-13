package com.xworkz.overrideToString.internal;

public class ExternalHDD {
    private String brand;
    private String model;
    private int capacity;

    public ExternalHDD(String brand, String model, int capacity) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "ExternalHDD [brand=" + brand + ", model=" + model + ", capacity=" + capacity + "TB]";
    }
    @Override
    public int hashCode() {
        return 30;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof ExternalHDD ){
                ExternalHDD obj1 = this;
                ExternalHDD obj2 = (ExternalHDD) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
