package com.xworkz.country;

public class State {
    String name;
    String capital;
    long population;
    boolean isDeveloped;

    District dist1 = new District("DistA", 101, 800000, true);
    District dist2 = new District("DistB", 102, 600000, false);
    District dist3 = new District("DistC", 103, 400000, true);
    District dist4 = new District("DistD", 104, 300000, false);
    District dist5 = new District("DistE", 105, 700000, true);

    District[] districts = {dist1, dist2, dist3, dist4, dist5};

    State(String name, String capital, long population, boolean isDeveloped) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.isDeveloped = isDeveloped;
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
