package com.xworkz.inheritance.internal.vehicle;

public class Train extends Vehicle {
    public void blowWhistle() {
        super.start();
        super.stop();
        super.accelerate();
        super.brake();
        super.honk();
        System.out.println("Train blowing whistle");
    }
}