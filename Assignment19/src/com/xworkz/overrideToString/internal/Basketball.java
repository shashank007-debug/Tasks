package com.xworkz.overrideToString.internal;

public class Basketball {
    private String brand;
    private String model;
    private double circumference;

    public Basketball(String brand, String model, double circumference) {
        this.brand = brand;
        this.model = model;
        this.circumference = circumference;
    }

    @Override
    public String toString() {
        return "Basketball [brand=" + brand + ", model=" + model + ", circumference=" + circumference + "in]";
    }
    @Override
    public int hashCode() {
        return 6;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Basketball){
                Basketball basketball1 = this;
                Basketball basketball2 = (Basketball) obj;
                return(basketball1.model.equals(basketball2.model));
            }
        }
        return false;
    }
}
