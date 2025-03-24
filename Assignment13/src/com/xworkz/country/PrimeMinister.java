package com.xworkz.country;

public class PrimeMinister {
    String name;
    int age;
    int termYears;
    Minister[] ministers;

    PrimeMinister(String name, int age, int termYears) {
        this.name = name;
        this.age = age;
        this.termYears = termYears;
        this.ministers = new Minister[]{
                new Minister("Amit Shah", "Education"),
                new Minister("Nirmala Sitharaman", "Finance"),
                new Minister("Rajnath Singh", "Defense"),
                new Minister("Smriti Irani", "Women and Child Development"),
                new Minister("Piyush Goyal", "Commerce")
        };
    }

    void display() {
        System.out.println("The Prime Minister name is : " + this.name);
        System.out.println("The Prime Minister age is : " + this.age);
        System.out.println("The Prime Minister termYears is :" + this.termYears);
        System.out.println("=====================================================================================");

        for (Minister minister : ministers) {
            System.out.println("The Minister name is : " + minister.name);
            System.out.println("The Minister ministry is : " + minister.ministry);
            minister.display();
            System.out.println("=====================================================================================");
        }
    }
}
