package com.xworkz.inheritance.internal.electronicdevice;

public class AndroidPhone extends Smartphone {
    public void openAppStore() {
        System.out.println("AndroidPhone opening Google Play Store");
    }

    public void invokeAll() {
        powerOn();
        charge();
        updateSoftware();
        connectWifi();
        powerOff();
    }

    public void checkAndCast(ElectronicDevice device) {
        if (device instanceof AndroidPhone) {
            ((AndroidPhone) device).openAppStore();
        } else {
            System.out.println("Not an AndroidPhone");
        }
    }
}
