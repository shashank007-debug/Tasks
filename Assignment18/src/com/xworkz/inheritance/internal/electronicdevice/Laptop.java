package com.xworkz.inheritance.internal.electronicdevice;

public class Laptop extends ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("Laptop powering on");
    }

    @Override
    public void powerOff() {
        System.out.println("Laptop powering off");
    }

    @Override
    public void charge() {
        System.out.println("Laptop charging");
    }

    @Override
    public void updateSoftware() {
        System.out.println("Laptop updating software");
    }

    @Override
    public void connectWifi() {
        System.out.println("Laptop connecting to WiFi");
    }
}
