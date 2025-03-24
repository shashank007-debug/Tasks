package com.xworkz.country;

public class PrimeMinister {
    String name;
    int age;
    int termYears;

    Minister minister1 = new Minister("Amit shah ","Education");
    Minister minister2 = new Minister("Amit shah ","Education");
    Minister minister3 = new Minister("Amit shah ","Education");
    Minister minister4 = new Minister("Amit shah ","Education");
    Minister minister5 = new Minister("Amit shah ","Education");
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
        System.out.println("=====================================================================================");

        for(Minister minister : ministers){
            System.out.println("The Minister name is : "+minister.name);
            System.out.println("The Minister ministery is : "+minister.ministry);
            minister.display();
            System.out.println("=====================================================================================");
        }

    }
}
