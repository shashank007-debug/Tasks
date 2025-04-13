package com.xworkz.overrideToString.internal;

public class DroneRacingSet {
    private String brand;
    private String model;
    private int maxSpeed;

    public DroneRacingSet(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "DroneRacingSet [brand=" + brand + ", model=" + model + ", maxSpeed=" + maxSpeed + "mph]";
    }
    @Override
    public int hashCode() {
        return 21;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof DroneRacingSet){
                DroneRacingSet obj1 = this;
                DroneRacingSet obj2 = (DroneRacingSet) obj;
                return(obj1.model.equals(obj2.model));
            }
        }
        return false;
    }
}
