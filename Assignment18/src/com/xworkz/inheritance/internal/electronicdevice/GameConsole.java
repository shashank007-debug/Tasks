package com.xworkz.inheritance.internal.electronicdevice;

public class GameConsole extends ElectronicDevice {
    @Override
    public void powerOn() {
        System.out.println("GameConsole powering on");
    }

    @Override
    public void powerOff() {
        System.out.println("GameConsole powering off");
    }

    @Override
    public void charge() {
        System.out.println("GameConsole charging");
    }

    @Override
    public void updateSoftware() {
        System.out.println("GameConsole updating software");
    }

    @Override
    public void connectWifi() {
        System.out.println("GameConsole connecting to WiFi");
    }
}
