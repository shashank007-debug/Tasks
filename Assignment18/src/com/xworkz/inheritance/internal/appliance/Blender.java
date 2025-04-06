package com.xworkz.inheritance.internal.appliance;

public class Blender extends Appliance {
    @Override
    public void plugIn() {
        System.out.println("Blender plugging in");
    }

    @Override
    public void turnOn() {
        System.out.println("Blender turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Blender turning off");
    }

    @Override
    public void clean() {
        System.out.println("Blender cleaning");
    }

    @Override
    public void repair() {
        System.out.println("Blender repairing");
    }
}
