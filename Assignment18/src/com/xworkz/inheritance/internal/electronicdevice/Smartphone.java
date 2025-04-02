package com.xworkz.inheritance.internal.electronicdevice;

public class Smartphone extends ElectronicDevice {
    public void makeCall() {
        super.powerOn();
        super.powerOff();
        super.charge();
        super.updateSoftware();
        super.connectWifi();
        System.out.println("Smartphone making call");
    }
}