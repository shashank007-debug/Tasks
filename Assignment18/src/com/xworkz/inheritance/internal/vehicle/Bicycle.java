package com.xworkz.inheritance.internal.vehicle;

public class Bicycle extends Vehicle {
    public void ringBell() {
        super.start();
        super.stop();
        super.accelerate();
        super.brake();
        super.honk();
        System.out.println("Bicycle ringing bell");
    }
}