package com.xworkz.inheritance.internal.vehicle;

public class Bicycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bicycle starting");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle braking");
    }

    @Override
    public void honk() {
        System.out.println("Bicycle ringing bell");
    }
}
