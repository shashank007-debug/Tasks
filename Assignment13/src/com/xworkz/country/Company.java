package com.xworkz.country;

public class Company {
    String name;
    String location;
    int employeeCount;
    boolean isMNC;

    Company(String name, String location, int employeeCount, boolean isMNC) {
        this.name = name;
        this.location = location;
        this.employeeCount = employeeCount;
        this.isMNC = isMNC;
    }

    void display() {
        System.out.println("Company Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Employee Count: " + this.employeeCount);
        System.out.println("Is MNC: " + this.isMNC);
        System.out.println("=====================================================================================");
    }
}
