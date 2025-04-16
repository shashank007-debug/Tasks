package com.xworkz.abstraction.internal;

public class Laptop extends Computer {
    private double screenSize;

    public Laptop(String cpu, int ram, int storage, String manufacturer, double screenSize) {
        super(cpu, ram, storage, manufacturer);
        this.screenSize = screenSize;
    }

    public void displaySpecs() {
        System.out.println(manufacturer + " laptop with " + cpu + ", " +
                ram + "GB RAM, " + storage + "GB storage, " +
                screenSize + "\" screen");
    }
}