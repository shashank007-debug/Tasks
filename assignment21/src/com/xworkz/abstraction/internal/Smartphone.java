package com.xworkz.abstraction.internal;

public class Smartphone extends ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("Smartphone booting up...");
    }
}