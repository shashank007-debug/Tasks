package com.xworkz.country;

public class Security {
    String agency;
    int guards;
    String shift;
    long contact;
    Details details;
    Personnel[] personnels;

    Security() {
        this.agency = "Hawk Eye Security";
        this.guards = 20;
        this.shift = "Day";
        this.contact = 9876543210L;
        this.details = new Details();
        this.personnels = new Personnel[]{
                new Personnel("Ravi", 30, "Head Guard", true),
                new Personnel("Arjun", 28, "Guard", true),
                new Personnel("Vijay", 35, "Guard", false),
                new Personnel("Kumar", 32, "Guard", true),
                new Personnel("Suresh", 29, "Guard", false)
        };
    }

    void display() {
        System.out.println("Agency Name: " + this.agency);
        System.out.println("Number of Guards: " + this.guards);
        System.out.println("Shift: " + this.shift);
        System.out.println("Contact: " + this.contact);
        System.out.println("=====================================================================================");

        details.display();
        System.out.println("=====================================================================================");

        for (Personnel personnel : personnels) {
            personnel.display();
            System.out.println("=====================================================================================");
        }
    }
}