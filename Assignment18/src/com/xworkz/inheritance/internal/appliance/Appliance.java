package com.xworkz.inheritance.internal.appliance;

public class Appliance {
    public Appliance() {
        System.out.println("no args Constructor of Appliance");
    }
    public void plugIn() {
        System.out.println("Appliance plugging in");
    }
    public void turnOn() {
        System.out.println("Appliance turning on");
    }
    public void turnOff() {
        System.out.println("Appliance turning off");
    }
    public void clean() {
        System.out.println("Appliance cleaning");
    }
    public void repair() {
        System.out.println("Appliance repairing");
    }
}
