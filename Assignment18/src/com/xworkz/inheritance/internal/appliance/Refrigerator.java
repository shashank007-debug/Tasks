package com.xworkz.inheritance.internal.appliance;

public class Refrigerator extends Appliance {
    @Override
    public void plugIn() {
        System.out.println("Refrigerator plugging in");
    }

    @Override
    public void turnOn() {
        System.out.println("Refrigerator turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator turning off");
    }

    @Override
    public void clean() {
        System.out.println("Refrigerator cleaning");
    }

    @Override
    public void repair() {
        System.out.println("Refrigerator repairing");
    }
}
