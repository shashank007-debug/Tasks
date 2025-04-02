package com.xworkz.inheritance.internal.vehicle;

public class Helicopter extends Vehicle {
    public void hover() {
        super.start();
        super.stop();
        super.accelerate();
        super.brake();
        super.honk();
        System.out.println("Helicopter hovering");
    }
}