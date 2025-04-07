package com.xworkz.inheritance.internal.electronicdevice;

public class EchoSpeaker extends SmartSpeaker {
    public void playMusic() {
        System.out.println("EchoSpeaker playing music");
    }

    public void invokeAll() {
        powerOn();
        charge();
        updateSoftware();
        connectWifi();
        powerOff();
    }

    public void checkAndCast(ElectronicDevice device) {
        if (device instanceof EchoSpeaker) {
            ((EchoSpeaker) device).playMusic();
        } else {
            System.out.println("Not an EchoSpeaker");
        }
    }
}
