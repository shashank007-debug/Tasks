package com.xworkz.inheritance.internal.electronicdevice;

public class TV extends ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("TV powering on");
    }

    @Override
    public void powerOff() {
        System.out.println("TV powering off");
    }

    @Override
    public void charge() {
        System.out.println("TV charging");
    }

    @Override
    public void updateSoftware() {
        System.out.println("TV updating software");
    }

    @Override
    public void connectWifi() {
        System.out.println("TV connecting to WiFi");
    }
}
