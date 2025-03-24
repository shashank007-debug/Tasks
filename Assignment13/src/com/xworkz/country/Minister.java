package com.xworkz.country;

public class Minister {
    String name;
    String ministry;
    PersonalAssistant[] personalAssistants;
    Portfolio[] portfolios;

    Minister(String name, String ministry) {
        this.name = name;
        this.ministry = ministry;
        this.personalAssistants = new PersonalAssistant[]{
                new PersonalAssistant("Ramesh", "PA101", 1234567890L),
                new PersonalAssistant("Tom", "PA102", 9876543210L),
                new PersonalAssistant("Raj", "PA103", 5566778899L),
                new PersonalAssistant("George", "PA104", 1122334455L),
                new PersonalAssistant("Lily", "PA105", 4455667788L)
        };
        this.portfolios = new Portfolio[]{
                new Portfolio("Finance", 1000000L),
                new Portfolio("Education", 2000000L),
                new Portfolio("Infrastructure", 1500000L),
                new Portfolio("Agriculture", 800000L),
                new Portfolio("Tourism", 1200000L)
        };
    }

    void display() {
        System.out.println("The name of Minister is : " + this.name);
        System.out.println("The name of ministry is : " + this.ministry);

        for (PersonalAssistant personalAssistant : personalAssistants) {
            System.out.println("The Personal Assistant for Minister : " + this.name + " is : " + personalAssistant.name);
            personalAssistant.display();
            System.out.println("=====================================================================================");
        }
        for (Portfolio portfolio : portfolios) {
            System.out.println("The Portfolio for Minister : " + this.name + " is : " + portfolio.name);
            portfolio.display();
            System.out.println("=====================================================================================");
        }
    }
}