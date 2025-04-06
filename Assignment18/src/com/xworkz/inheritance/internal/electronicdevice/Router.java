package com.xworkz.inheritance.internal.electronicdevice;

public class Router extends ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("Router powering on");
    }

    @Override
    public void powerOff() {
        System.out.println("Router powering off");
    }

    @Override
    public void charge() {
        System.out.println("Router charging");
    }

    @Override
    public void updateSoftware() {
        System.out.println("Router updating software");
    }

    @Override
    public void connectWifi() {
        System.out.println("Router connecting to WiFi");
    }
}
