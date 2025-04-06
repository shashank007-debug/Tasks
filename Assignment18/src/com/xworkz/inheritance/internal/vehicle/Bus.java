package com.xworkz.inheritance.internal.vehicle;

public class Bus extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bus starting");
    }

    @Override
    public void stop() {
        System.out.println("Bus stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Bus accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Bus braking");
    }

    @Override
    public void honk() {
        System.out.println("Bus honking");
    }
}
