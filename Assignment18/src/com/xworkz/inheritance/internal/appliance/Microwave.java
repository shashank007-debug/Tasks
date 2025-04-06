package com.xworkz.inheritance.internal.appliance;

public class Microwave extends Appliance {
    @Override
    public void plugIn() {
        System.out.println("Microwave plugging in");
    }

    @Override
    public void turnOn() {
        System.out.println("Microwave turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Microwave turning off");
    }

    @Override
    public void clean() {
        System.out.println("Microwave cleaning");
    }

    @Override
    public void repair() {
        System.out.println("Microwave repairing");
    }
}
