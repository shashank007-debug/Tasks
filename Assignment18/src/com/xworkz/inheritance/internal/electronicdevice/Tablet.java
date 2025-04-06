package com.xworkz.inheritance.internal.electronicdevice;

public class Tablet extends ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("Tablet powering on");
    }

    @Override
    public void powerOff() {
        System.out.println("Tablet powering off");
    }

    @Override
    public void charge() {
        System.out.println("Tablet charging");
    }

    @Override
    public void updateSoftware() {
        System.out.println("Tablet updating software");
    }

    @Override
    public void connectWifi() {
        System.out.println("Tablet connecting to WiFi");
    }
}
