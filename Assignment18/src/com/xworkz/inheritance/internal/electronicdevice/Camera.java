package com.xworkz.inheritance.internal.electronicdevice;

public class Camera extends ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("Camera powering on");
    }

    @Override
    public void powerOff() {
        System.out.println("Camera powering off");
    }

    @Override
    public void charge() {
        System.out.println("Camera charging");
    }

    @Override
    public void updateSoftware() {
        System.out.println("Camera updating software");
    }

    @Override
    public void connectWifi() {
        System.out.println("Camera connecting to WiFi");
    }
}
