package com.xworkz.overrideToString.internal;

public class BloodPressureMonitor {
    private String brand;
    private String model;
    private String type;

    public BloodPressureMonitor(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "BloodPressureMonitor [brand=" + brand + ", model=" + model + ", type=" + type + "]";
    }

    @Override
    public int hashCode() {
        return 9;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof BloodPressureMonitor){
                BloodPressureMonitor obj1 = this;
                BloodPressureMonitor obj2 = (BloodPressureMonitor) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
