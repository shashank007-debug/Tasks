package com.xworkz.inheritance.internal.appliance;

public class WashingMachine extends Appliance {
    @Override
    public void plugIn() {
        System.out.println("WashingMachine plugging in");
    }

    @Override
    public void turnOn() {
        System.out.println("WashingMachine turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("WashingMachine turning off");
    }

    @Override
    public void clean() {
        System.out.println("WashingMachine cleaning");
    }

    @Override
    public void repair() {
        System.out.println("WashingMachine repairing");
    }
}
