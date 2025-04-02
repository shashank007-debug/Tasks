package com.xworkz.inheritance.internal.vehicle;

public class Scooter extends Vehicle {
    public void fold() {
        super.start();
        super.stop();
        super.accelerate();
        super.brake();
        super.honk();
        System.out.println("Scooter folding");
    }
}