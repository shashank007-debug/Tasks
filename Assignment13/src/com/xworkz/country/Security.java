package com.xworkz.country;

public class Security {
    String agency = "Hawk Eye Security";
    int guards = 20;
    String shift = "Day";
    long contact = 9876543210L;

    Details details = new Details();

    Personnel personnel1 = new Personnel("Ravi", 30, "Head Guard", true);
    Personnel personnel2 = new Personnel("Arjun", 28, "Guard", true);
    Personnel personnel3 = new Personnel("Vijay", 35, "Guard", false);
    Personnel personnel4 = new Personnel("Kumar", 32, "Guard", true);
    Personnel personnel5 = new Personnel("Suresh", 29, "Guard", false);
    Personnel[] personnels = {personnel1, personnel2, personnel3, personnel4, personnel5};

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
