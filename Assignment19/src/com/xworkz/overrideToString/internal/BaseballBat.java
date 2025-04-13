package com.xworkz.overrideToString.internal;

public class BaseballBat {
    private String brand;
    private String model;
    private int length;

    public BaseballBat(String brand, String model, int length) {
        this.brand = brand;
        this.model = model;
        this.length = length;
    }

    @Override
    public String toString() {
        return "BaseballBat [brand=" + brand + ", model=" + model + ", length=" + length + "in]";
    }
    @Override
    public int hashCode() {
        return 5;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof BaseballBat){
                BaseballBat baseballBat1 = this;
                BaseballBat baseballBat2 = (BaseballBat) obj;
                return(baseballBat1.model.equals(baseballBat2.model));
            }
        }
        return false;
    }
}
