package com.xworkz.inheritance.internal.appliance;

public class AirFryer extends Appliance {
    @Override
    public void plugIn() {
        System.out.println("AirFryer plugging in");
    }

    @Override
    public void turnOn() {
        System.out.println("AirFryer turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("AirFryer turning off");
    }

    @Override
    public void clean() {
        System.out.println("AirFryer cleaning");
    }

    @Override
    public void repair() {
        System.out.println("AirFryer repairing");
    }
}
