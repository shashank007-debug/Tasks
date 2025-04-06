package com.xworkz.inheritance.internal.vehicle;

public class Helicopter extends Vehicle {
    @Override
    public void start() {
        System.out.println("Helicopter starting");
    }

    @Override
    public void stop() {
        System.out.println("Helicopter stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Helicopter accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Helicopter braking");
    }

    @Override
    public void honk() {
        System.out.println("Helicopter honking");
    }
}
