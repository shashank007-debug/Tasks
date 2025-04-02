package com.xworkz.inheritance.internal.vehicle;

public class Airplane extends Vehicle {
    public void takeOff() {
        super.start();
        super.stop();
        super.accelerate();
        super.brake();
        super.honk();
        System.out.println("Airplane taking off");
    }
}