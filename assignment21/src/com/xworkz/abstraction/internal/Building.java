package com.xworkz.abstraction.internal;

abstract class Building {
    protected int floors;
    protected double area;
    protected String address;

    public Building(int floors, double area, String address) {
        this.floors = floors;
        this.area = area;
        this.address = address;
    }
}