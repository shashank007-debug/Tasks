package com.xworkz.inheritance.internal.electronicdevice;

public class SmartTV extends TV {
    public void streamNetflix() {
        System.out.println("SmartTV streaming Netflix");
    }

    public void invokeAll() {
        powerOn();
        charge();
        updateSoftware();
        connectWifi();
        powerOff();
    }

    public void checkAndCast(ElectronicDevice device) {
        if (device instanceof SmartTV) {
            ((SmartTV) device).streamNetflix();
        } else {
            System.out.println("Not a SmartTV");
        }
    }
}
