package com.xworkz.inheritance.internal.electronicdevice;

public class ElectronicDevice {
    public ElectronicDevice() {
        System.out.println("no-args Constructor of ElectronicDevice");
    }
    public void powerOn() {
        System.out.println("Device powering on");
    }
    public void powerOff() {
        System.out.println("Device powering off");
    }
    public void charge() {
        System.out.println("Device charging");
    }
    public void updateSoftware() {
        System.out.println("Device updating");
    }
    public void connectWifi() {
        System.out.println("Device connecting to WiFi");
    }
}
