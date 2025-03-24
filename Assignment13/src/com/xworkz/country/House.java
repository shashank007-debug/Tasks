package com.xworkz.country;

public class House {
    String address = "Default Address";
    int houseNo = 0;
    int floorCount = 2;
    boolean hasGarden = true;

    Room room1 = new Room("Bedroom", 101, 200.0, true);
    Room room2 = new Room("Hall", 102, 300.0, false);
    Room room3 = new Room("Kitchen", 103, 150.0, true);
    Room room4 = new Room("Bathroom", 104, 100.0, false);
    Room room5 = new Room("Balcony", 105, 120.0, false);
    Room[] rooms = {room1, room2, room3, room4, room5};

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
