package com.xworkz.inheritance.internal.vehicle;

public class Train extends Vehicle {
    @Override
    public void start() {
        System.out.println("Train starting");
    }

    @Override
    public void stop() {
        System.out.println("Train stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Train accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Train braking");
    }

    @Override
    public void honk() {
        System.out.println("Train honking");
    }
}
