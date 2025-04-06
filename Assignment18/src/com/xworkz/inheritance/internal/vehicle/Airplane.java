package com.xworkz.inheritance.internal.vehicle;

public class Airplane extends Vehicle {
    @Override
    public void start() {
        System.out.println("Airplane starting");
    }

    @Override
    public void stop() {
        System.out.println("Airplane stopping");
    }

    @Override
    public void accelerate() {
        System.out.println("Airplane accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Airplane braking");
    }

    @Override
    public void honk() {
        System.out.println("Airplane honking");
    }
}