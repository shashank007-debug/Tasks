package com.xworkz.AccessModifier.External;

public class Hospital {
    public String name;
    String location;
    private int rooms;

    public void admitPatient() {
        this.rooms = 30;
        System.out.println("Admitting patient to hospital with rooms: " + this.rooms);
    }

    public void manageStaff() {
        this.sanitize();
        System.out.println("Managing hospital staff.");
    }

    private void sanitize() {
        System.out.println("Sanitizing hospital wards.");
    }
}
