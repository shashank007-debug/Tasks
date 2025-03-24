package com.xworkz.country;

public class Country {
    String name;
    long population;
    String currency;
    PrimeMinister primeMinister = new PrimeMinister("Narendra Modi", 73, 10);

    Country(String name, long population, String currency){
        this.name = name;
        this.population = population;
        this.currency = currency;
    }

    void display(){
        System.out.println("The name of the country is : "+this.name);
        System.out.println("The population of the : "+this.name+" is :"+this.population);
        System.out.println("The Currency  of "+this.name+" Country is : "+this.currency);
        System.out.println("=====================================================================================");
        primeMinister.display();
        System.out.println("=====================================================================================");

    }
}
