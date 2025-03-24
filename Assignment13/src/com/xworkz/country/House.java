package com.xworkz.country;

public class House {
    String address;
    int houseNo;
    int floorCount;
    boolean hasGarden;
    Room[] rooms;

    House(String address, int houseNo, int floorCount, boolean hasGarden) {
        this.address = address;
        this.houseNo = houseNo;
        this.floorCount = floorCount;
        this.hasGarden = hasGarden;
        this.rooms = new Room[]{
                new Room("Bedroom", 101, 200.0, true),
                new Room("Hall", 102, 300.0, false),
                new Room("Kitchen", 103, 150.0, true),
                new Room("Bathroom", 104, 100.0, false),
                new Room("Balcony", 105, 120.0, false)
        };
    }

    void display() {
        System.out.println("House Address: " + this.address);
        System.out.println("House No: " + this.houseNo);
        System.out.println("Floor Count: " + this.floorCount);
        System.out.println("Has Garden: " + this.hasGarden);
        System.out.println("=====================================================================================");

        for (Room room : rooms) {
            room.display();
            System.out.println("=====================================================================================");
        }
    }
}