package com.xworkz.inheritance.internal.vehicle;

public class Truck extends Vehicle {
    @Override
    public void start() {
        System.out.println("Truck starting");
    }

    @Override
    public void stop() {
        System.out.println("Truck stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Truck braking");
    }

    @Override
    public void honk() {
        System.out.println("Truck honking");
    }
}
