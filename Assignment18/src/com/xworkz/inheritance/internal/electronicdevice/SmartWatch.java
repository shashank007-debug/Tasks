package com.xworkz.inheritance.internal.electronicdevice;

public class SmartWatch extends ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("SmartWatch powering on");
    }

    @Override
    public void powerOff() {
        System.out.println("SmartWatch powering off");
    }

    @Override
    public void charge() {
        System.out.println("SmartWatch charging");
    }

    @Override
    public void updateSoftware() {
        System.out.println("SmartWatch updating software");
    }

    @Override
    public void connectWifi() {
        System.out.println("SmartWatch connecting to WiFi");
    }
}
