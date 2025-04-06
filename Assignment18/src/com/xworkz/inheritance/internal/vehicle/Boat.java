package com.xworkz.inheritance.internal.vehicle;

public class Boat extends Vehicle {
    @Override
    public void start() {
        System.out.println("Boat starting");
    }

    @Override
    public void stop() {
        System.out.println("Boat stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Boat accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Boat braking");
    }

    @Override
    public void honk() {
        System.out.println("Boat honking");
    }
}
