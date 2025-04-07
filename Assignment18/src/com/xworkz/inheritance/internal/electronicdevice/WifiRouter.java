package com.xworkz.inheritance.internal.electronicdevice;

public class WifiRouter extends Router {
    public void broadcastSignal() {
        System.out.println("WifiRouter broadcasting WiFi signal");
    }

    public void invokeAll() {
        powerOn();
        charge();
        updateSoftware();
        connectWifi();
        powerOff();
    }

    public void checkAndCast(ElectronicDevice device) {
        if (device instanceof WifiRouter) {
            ((WifiRouter) device).broadcastSignal();
        } else {
            System.out.println("Not a WifiRouter");
        }
    }
}
