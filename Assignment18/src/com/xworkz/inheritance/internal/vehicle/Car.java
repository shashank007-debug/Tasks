package com.xworkz.inheritance.internal.vehicle;

public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starting");
    }

    @Override
    public void stop() {
        System.out.println("Car stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car braking");
    }

    @Override
    public void honk() {
        System.out.println("Car honking");
    }
}
