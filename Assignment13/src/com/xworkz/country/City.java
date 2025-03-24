package com.xworkz.country;

public class City {
    String name;
    int population;
    double area;
    boolean isCapital;
    Ward[] wards;

    City(String name, int population, double area, boolean isCapital) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.isCapital = isCapital;
        this.wards = new Ward[]{
                new Ward(1, "A Block", 10000, "Mr. Ram"),
                new Ward(2, "B Block", 12000, "Mr. Shyam"),
                new Ward(3, "C Block", 8000, "Ms. Sita"),
                new Ward(4, "D Block", 15000, "Mr. Ravi"),
                new Ward(5, "E Block", 7000, "Ms. Gita")
        };
    }

    void display() {
        System.out.println("City Name: " + this.name);
        System.out.println("Population: " + this.population);
        System.out.println("Area: " + this.area);
        System.out.println("Is Capital: " + this.isCapital);
        System.out.println("=====================================================================================");
        for (Ward ward : wards) {
            ward.display();
            System.out.println("=====================================================================================");
        }
    }
}