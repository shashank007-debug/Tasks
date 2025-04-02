package com.xworkz.inheritance.internal.electronicdevice;

public class Laptop extends ElectronicDevice {
    public void type() {
        super.powerOn();
        super.powerOff();
        super.charge();
        super.updateSoftware();
        super.connectWifi();
        System.out.println("Laptop typing");
    }
}