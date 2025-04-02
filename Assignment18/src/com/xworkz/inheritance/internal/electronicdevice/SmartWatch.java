package com.xworkz.inheritance.internal.electronicdevice;

public class SmartWatch extends ElectronicDevice {
    public void trackHeartRate() {
        super.powerOn();
        super.powerOff();
        super.charge();
        super.updateSoftware();
        super.connectWifi();
        System.out.println("SmartWatch tracking heart rate");
    }
}