package com.xworkz.country;

public class PersonalAssistant {
    String name;
    String employeeId;
    long contact;
    House house1 = new House();
    House house2 = new House();
    House house3 = new House();
    House house4 = new House();
    House house5 = new House();
    House[] houses = {house1, house2, house3, house4, house5};
    Security security= new Security();

    PersonalAssistant(String name, String employeeId, long contact){
        this.name = name;
        this.employeeId = employeeId;
        this.contact = contact;
    }

    void display(){
        System.out.println("The name of Personal Assistant is : "+this.name);
        System.out.println("The employee ID of Personal Assistant is : "+this.employeeId);

        for(House house : houses){
            house.display();
            System.out.println("=======================================================");
            security.display();
        }

    }

}
