package com.xworkz.inheritance.internal.appliance;

public class Dishwasher extends Appliance {
    @Override
    public void plugIn() {
        System.out.println("Dishwasher plugging in");
    }

    @Override
    public void turnOn() {
        System.out.println("Dishwasher turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Dishwasher turning off");
    }

    @Override
    public void clean() {
        System.out.println("Dishwasher cleaning");
    }

    @Override
    public void repair() {
        System.out.println("Dishwasher repairing");
    }
}
