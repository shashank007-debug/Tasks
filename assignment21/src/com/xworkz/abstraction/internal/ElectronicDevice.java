package com.xworkz.abstraction.internal;

abstract class ElectronicDevice {
    public abstract void powerOn();

    public void showBrand(String brand) {
        System.out.println("Brand: " + brand);
    }
}