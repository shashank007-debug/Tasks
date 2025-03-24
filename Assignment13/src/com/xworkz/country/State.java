package com.xworkz.country;

public class State {
    String name;
    String capital;
    long population;
    boolean isDeveloped;
    District[] districts;

    State(String name, String capital, long population, boolean isDeveloped) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.isDeveloped = isDeveloped;
        this.districts = new District[]{
                new District("DistA", 101, 800000, true),
                new District("DistB", 102, 600000, false),
                new District("DistC", 103, 400000, true),
                new District("DistD", 104, 300000, false),
                new District("DistE", 105, 700000, true)
        };
    }

    void display() {
        System.out.println("State Name: " + this.name);
        System.out.println("Capital: " + this.capital);
        System.out.println("Population: " + this.population);
        System.out.println("Is Developed: " + this.isDeveloped);
        System.out.println("=====================================================================================");
        for (District district : districts) {
            district.display();
            System.out.println("=====================================================================================");
        }
    }
}