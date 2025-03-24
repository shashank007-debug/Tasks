package com.xworkz.country;

public class Room {
    String type;
    int roomNo;
    double size;
    boolean isOccupied;

    Room(String type, int roomNo, double size, boolean isOccupied) {
        this.type = type;
        this.roomNo = roomNo;
        this.size = size;
        this.isOccupied = isOccupied;
    }

    void display() {
        System.out.println("Room Type: " + this.type);
        System.out.println("Room No: " + this.roomNo);
        System.out.println("Size: " + this.size);
        System.out.println("Occupied: " + this.isOccupied);
        System.out.println("=====================================================================================");
    }
}