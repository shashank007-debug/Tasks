package com.xworkz.country;

public class City {
    String name;
    int population;
    double area;
    boolean isCapital;

    Ward ward1 = new Ward(1, "A Block", 10000, "Mr. Ram");
    Ward ward2 = new Ward(2, "B Block", 12000, "Mr. Shyam");
    Ward ward3 = new Ward(3, "C Block", 8000, "Ms. Sita");
    Ward ward4 = new Ward(4, "D Block", 15000, "Mr. Ravi");
    Ward ward5 = new Ward(5, "E Block", 7000, "Ms. Gita");

    Ward[] wards = {ward1, ward2, ward3, ward4, ward5};

    City(String name, int population, double area, boolean isCapital) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.isCapital = isCapital;
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
