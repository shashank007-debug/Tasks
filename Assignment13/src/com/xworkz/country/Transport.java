package com.xworkz.country;

public class Transport {
    String type;
    String regNo;
    int capacity;
    boolean isAvailable;

    Transport(String type, String regNo, int capacity, boolean isAvailable) {
        this.type = type;
        this.regNo = regNo;
        this.capacity = capacity;
        this.isAvailable = isAvailable;
    }

    void display() {
        System.out.println("Transport Type: " + this.type);
        System.out.println("Registration No: " + this.regNo);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Available: " + this.isAvailable);
        System.out.println("=====================================================================================");
    }
}
