package com.xworkz.inheritance.internal.appliance;

public class Oven extends Appliance {
    @Override
    public void plugIn() {
        System.out.println("Oven plugging in");
    }

    @Override
    public void turnOn() {
        System.out.println("Oven turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Oven turning off");
    }

    @Override
    public void clean() {
        System.out.println("Oven cleaning");
    }

    @Override
    public void repair() {
        System.out.println("Oven repairing");
    }
}
