package com.xworkz.inheritance.internal.electronicdevice;

public class Smartphone extends ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("Smartphone powering on");
    }

    @Override
    public void powerOff() {
        System.out.println("Smartphone powering off");
    }

    @Override
    public void charge() {
        System.out.println("Smartphone charging");
    }

    @Override
    public void updateSoftware() {
        System.out.println("Smartphone updating software");
    }

    @Override
    public void connectWifi() {
        System.out.println("Smartphone connecting to WiFi");
    }
}
