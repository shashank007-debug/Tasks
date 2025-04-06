package com.xworkz.inheritance.internal.vehicle;

public class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle starting");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Motorcycle braking");
    }

    @Override
    public void honk() {
        System.out.println("Motorcycle honking");
    }
}
