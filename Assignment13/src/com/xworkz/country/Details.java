package com.xworkz.country;

public class Details {
    String projectName;
    int durationInMonths;
    String manager;
    double budget;

    Details() {
        this.projectName = "Smart City";
        this.durationInMonths = 12;
        this.manager = "Mr. Kiran";
        this.budget = 5000000.00;
    }

    void display() {
        System.out.println("Project Name: " + this.projectName);
        System.out.println("Duration (Months): " + this.durationInMonths);
        System.out.println("Manager: " + this.manager);
        System.out.println("Budget: " + this.budget);
        System.out.println("=====================================================================================");
    }
}
