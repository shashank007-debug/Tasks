package com.xworkz.inheritance.internal.electronicdevice;

public class GamingLaptop extends Laptop {
    public void launchGame() {
        System.out.println("GamingLaptop launching a game");
    }

    public void invokeAll() {
        powerOn();
        charge();
        updateSoftware();
        connectWifi();
        powerOff();
    }

    public void checkAndCast(ElectronicDevice device) {
        if (device instanceof GamingLaptop) {
            ((GamingLaptop) device).launchGame();
        } else {
            System.out.println("Not a GamingLaptop");
        }
    }
}
