package com.xworkz.inheritance.internal.electronicdevice;

public class PlayStation extends GameConsole {
    public void loadGame() {
        System.out.println("PlayStation loading game...");
    }

    public void invokeAll() {
        powerOn();
        charge();
        updateSoftware();
        connectWifi();
        powerOff();
    }

    public void checkAndCast(ElectronicDevice device) {
        if (device instanceof PlayStation) {
            ((PlayStation) device).loadGame();
        } else {
            System.out.println("Not a PlayStation");
        }
    }
}
