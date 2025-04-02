package com.xworkz.inheritance.internal.electronicdevice;

public class Camera extends ElectronicDevice {
    public void takePhoto() {
        super.powerOn();
        super.powerOff();
        super.charge();
        super.updateSoftware();
        super.connectWifi();
        System.out.println("Camera taking photo");
    }
}
