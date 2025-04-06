package com.xworkz.inheritance.internal.electronicdevice;

public class SmartSpeaker extends ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("SmartSpeaker powering on");
    }

    @Override
    public void powerOff() {
        System.out.println("SmartSpeaker powering off");
    }

    @Override
    public void charge() {
        System.out.println("SmartSpeaker charging");
    }

    @Override
    public void updateSoftware() {
        System.out.println("SmartSpeaker updating software");
    }

    @Override
    public void connectWifi() {
        System.out.println("SmartSpeaker connecting to WiFi");
    }
}
