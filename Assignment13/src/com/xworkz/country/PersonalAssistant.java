package com.xworkz.country;

public class PersonalAssistant {
    String name;
    String employeeId;
    long contact;
    House[] houses;
    Security security;

    PersonalAssistant(String name, String employeeId, long contact) {
        this.name = name;
        this.employeeId = employeeId;
        this.contact = contact;
        this.houses = new House[]{
                new House("Default Address", 0, 2, true),
                new House("Default Address", 0, 2, true),
                new House("Default Address", 0, 2, true),
                new House("Default Address", 0, 2, true),
                new House("Default Address", 0, 2, true)
        };
        this.security = new Security();
    }

    void display() {
        System.out.println("The name of Personal Assistant is : " + this.name);
        System.out.println("The employee ID of Personal Assistant is : " + this.employeeId);
        System.out.println("=====================================================================================");

        for (House house : houses) {
            house.display();
            System.out.println("=======================================================");
            security.display();
            System.out.println("=====================================================================================");
        }
    }
}