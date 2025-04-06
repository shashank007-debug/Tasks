package com.xworkz.inheritance.internal.vehicle;

public class Scooter extends Vehicle {
    @Override
    public void start() {
        System.out.println("Scooter starting");
    }

    @Override
    public void stop() {
        System.out.println("Scooter stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Scooter accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Scooter braking");
    }

    @Override
    public void honk() {
        System.out.println("Scooter honking");
    }
}
