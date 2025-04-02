package com.xworkz.inheritance.internal.vehicle;

public class Vehicle {
    public Vehicle() {
        System.out.println("no-args constructor of Vehicle");
    }
    public void start() {
        System.out.println("Vehicle starting");
    }
    public void stop() {
        System.out.println("Vehicle stopping");
    }
    public void accelerate() {
        System.out.println("Vehicle accelerating");
    }
    public void brake() {
        System.out.println("Vehicle braking");
    }
    public void honk() {
        System.out.println("Vehicle honking");
    }
}
