package com.xworkz.country;

public class District {
    String name;
    int districtCode;
    int population;
    boolean isUrban;
    City[] cities;

    District(String name, int districtCode, int population, boolean isUrban) {
        this.name = name;
        this.districtCode = districtCode;
        this.population = population;
        this.isUrban = isUrban;
        this.cities = new City[]{
                new City("CityA", 500000, 300.5, true),
                new City("CityB", 200000, 180.0, false),
                new City("CityC", 350000, 210.0, false),
                new City("CityD", 150000, 150.0, false),
                new City("CityE", 100000, 100.0, false)
        };
    }

    void display() {
        System.out.println("District Name: " + this.name);
        System.out.println("District Code: " + this.districtCode);
        System.out.println("Population: " + this.population);
        System.out.println("Is Urban: " + this.isUrban);
        System.out.println("=====================================================================================");
        for (City city : cities) {
            city.display();
            System.out.println("=====================================================================================");
        }
    }
}