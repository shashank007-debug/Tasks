package com.xworkz.inheritance.internal.appliance;

public class VacuumCleaner extends Appliance {
    @Override
    public void plugIn() {
        System.out.println("VacuumCleaner plugging in");
    }

    @Override
    public void turnOn() {
        System.out.println("VacuumCleaner turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("VacuumCleaner turning off");
    }

    @Override
    public void clean() {
        System.out.println("VacuumCleaner cleaning");
    }

    @Override
    public void repair() {
        System.out.println("VacuumCleaner repairing");
    }
}
