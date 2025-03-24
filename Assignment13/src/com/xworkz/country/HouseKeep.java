package com.xworkz.country;

public class HouseKeep {
    String name;
    int age;
    String shift;
    boolean isPermanent;
    Transport[] transports;

    HouseKeep(String name, int age, String shift, boolean isPermanent) {
        this.name = name;
        this.age = age;
        this.shift = shift;
        this.isPermanent = isPermanent;
        this.transports = new Transport[]{
                new Transport("Van", "KA01AB1234", 10, true),
                new Transport("Bike", "KA01CD5678", 2, false),
                new Transport("Bus", "KA02EF9012", 30, true),
                new Transport("Car", "KA03GH3456", 4, false),
                new Transport("Auto", "KA04IJ7890", 3, true)
        };
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