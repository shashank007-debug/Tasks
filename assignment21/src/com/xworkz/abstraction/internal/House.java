package com.xworkz.abstraction.internal;

public class House extends Building {
    public House(int floors, double area, String address) {
        super(floors, area, address);
    }

    public void displayInfo() {
        System.out.println( " built this " + floors +
                "-floor house (" + area + " sqm) at " + address);
    }
}