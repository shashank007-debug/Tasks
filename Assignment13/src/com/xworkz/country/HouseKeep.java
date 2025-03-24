package com.xworkz.country;

public class HouseKeep {
    String name;
    int age;
    String shift;
    boolean isPermanent;

    Transport transport1 = new Transport("Van", "KA01AB1234", 10, true);
    Transport transport2 = new Transport("Bike", "KA01CD5678", 2, false);
    Transport transport3 = new Transport("Bus", "KA02EF9012", 30, true);
    Transport transport4 = new Transport("Car", "KA03GH3456", 4, false);
    Transport transport5 = new Transport("Auto", "KA04IJ7890", 3, true);

    Transport[] transports = {transport1, transport2, transport3, transport4, transport5};

    HouseKeep(String name, int age, String shift, boolean isPermanent) {
        this.name = name;
        this.age = age;
        this.shift = shift;
        this.isPermanent = isPermanent;
    }

    void display() {
        System.out.println("Housekeeper Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Shift: " + this.shift);
        System.out.println("Is Permanent: " + this.isPermanent);
        System.out.println("=====================================================================================");
        for (Transport transport : transports) {
            transport.display();
            System.out.println("=====================================================================================");
        }
    }
}
