package com.xworkz.country;

public class PrimeMinister {
    String name;
    int age;
    int termYears;
    Minister minister1 = new Minister("Amit Shah","Home");
    Minister minister2 = new Minister("Antony Blinken", "Foreign Affairs");
    Minister minister3 = new Minister("Suella Braverman", "Justice");
    Minister minister4 = new Minister("Mélanie Joly", "Health");
    Minister minister5 = new Minister("Penny Wong", " Defense");
    Minister[] ministers = {minister1, minister2, minister3, minister4, minister5};

    PrimeMinister(String name, int age, int termYears){
        this.name = name;
        this.age = age;
        this.termYears = termYears;
    }
    void display(){
        System.out.println("The PrimeMinister name is : "+this.name);
        System.out.println("The PrimeMinister age is : "+this.age);
        System.out.println("The PrimeMinister termYears is :"+this.termYears);

        for(Minister minister : ministers){
            System.out.println("The Minister name is : "+minister.name);
            System.out.println("The Minister ministery is : "+minister.ministry);
            minister.display();
        }

    }
}
