package com.xworkz.country;

public class Portfolio {
    String name;
    long budget;
    Details[] details;
    House[] houses;

    Portfolio(String name, long budget) {
        this.name = name;
        this.budget = budget;
        this.details = new Details[]{
                new Details(),
                new Details(),
                new Details(),
                new Details(),
                new Details()
        };
        this.houses = new House[]{
                new House("Default Address", 0, 2, true),
                new House("Default Address", 0, 2, true),
                new House("Default Address", 0, 2, true),
                new House("Default Address", 0, 2, true),
                new House("Default Address", 0, 2, true)
        };
    }

    void display() {
        System.out.println("The name of Portfolio is : " + this.name);
        System.out.println("The budget of Portfolio is : " + this.budget);
        for (Details detail : details) {
            System.out.println("Printing details of Portfolio name : " + this.name);
            detail.display();
            System.out.println("=====================================================================================");
        }
        for (House house : houses) {
            System.out.println("Printing house of Portfolio name : " + this.name);
            house.display();
            System.out.println("=====================================================================================");
        }
    }
}
