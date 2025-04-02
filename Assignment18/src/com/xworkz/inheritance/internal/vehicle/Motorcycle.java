package com.xworkz.inheritance.internal.vehicle;

public class Motorcycle extends Vehicle {
    public void wheelie() {
        super.start();
        super.stop();
        super.accelerate();
        super.brake();
        super.honk();
        System.out.println("Motorcycle doing wheelie");
    }
}