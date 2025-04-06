package com.xworkz.inheritance.internal.appliance;

public class Toaster extends Appliance {
    @Override
    public void plugIn() {
        System.out.println("Toaster plugging in");
    }

    @Override
    public void turnOn() {
        System.out.println("Toaster turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Toaster turning off");
    }

    @Override
    public void clean() {
        System.out.println("Toaster cleaning");
    }

    @Override
    public void repair() {
        System.out.println("Toaster repairing");
    }
}
