package com.xworkz.inheritance.internal.appliance;

public class CoffeeMaker extends Appliance {
    @Override
    public void plugIn() {
        System.out.println("CoffeeMaker plugging in");
    }

    @Override
    public void turnOn() {
        System.out.println("CoffeeMaker turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("CoffeeMaker turning off");
    }

    @Override
    public void clean() {
        System.out.println("CoffeeMaker cleaning");
    }

    @Override
    public void repair() {
        System.out.println("CoffeeMaker repairing");
    }
}
