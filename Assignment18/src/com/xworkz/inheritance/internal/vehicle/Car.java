package com.xworkz.inheritance.internal.vehicle;

public class Car extends Vehicle {
    public void openTrunk() {
        super.start();
        super.stop();
        super.accelerate();
        super.brake();
        super.honk();
        System.out.println("Opening car trunk");
    }
}

