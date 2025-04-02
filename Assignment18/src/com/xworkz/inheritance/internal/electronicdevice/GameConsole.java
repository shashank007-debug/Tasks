package com.xworkz.inheritance.internal.electronicdevice;

public class GameConsole extends ElectronicDevice {
    public void playGame() {
        super.powerOn();
        super.powerOff();
        super.charge();
        super.updateSoftware();
        super.connectWifi();
        System.out.println("GameConsole playing game");
    }
}