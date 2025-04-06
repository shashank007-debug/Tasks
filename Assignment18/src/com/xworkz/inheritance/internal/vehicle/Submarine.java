package com.xworkz.inheritance.internal.vehicle;

public class Submarine extends Vehicle {
    @Override
    public void start() {
        System.out.println("Submarine starting");
    }

    @Override
    public void stop() {
        System.out.println("Submarine stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Submarine accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Submarine braking");
    }

    @Override
    public void honk() {
        System.out.println("Submarine sounding sonar");
    }
}
