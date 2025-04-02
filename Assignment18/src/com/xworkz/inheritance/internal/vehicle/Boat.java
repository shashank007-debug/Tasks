package com.xworkz.inheritance.internal.vehicle;

public class Boat extends Vehicle {
    public void anchor() {
        super.start();
        super.stop();
        super.accelerate();
        super.brake();
        super.honk();
        System.out.println("Boat dropping anchor");
    }
}