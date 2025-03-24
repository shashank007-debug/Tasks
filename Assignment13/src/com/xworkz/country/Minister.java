package com.xworkz.country;

public class Minister {
    String name;
    String ministry;
    PersonalAssistant personalAssistant1 = new PersonalAssistant("Ramesh", "PA101", 1234567890L);
    PersonalAssistant personalAssistant2 = new PersonalAssistant("Tom", "PA102",9876543210L);
    PersonalAssistant personalAssistant3 = new PersonalAssistant("Raj", "PA103", 5566778899L);
    PersonalAssistant personalAssistant4 = new PersonalAssistant("George", "PA103", 1122334455L);
    PersonalAssistant personalAssistant5 = new PersonalAssistant("Lily", "PA105",  4455667788L);
    PersonalAssistant[] personalAssistants = {personalAssistant1, personalAssistant2, personalAssistant3, personalAssistant4, personalAssistant5};
    Portfolio portfolio1 = new Portfolio("Finance",1000000L);
    Portfolio portfolio2 = new Portfolio("Education", 2000000L);
    Portfolio portfolio3 = new Portfolio("Infrastructure", 1500000L);
    Portfolio portfolio4 = new Portfolio("Agriculture", 800000L);
    Portfolio portfolio5 = new Portfolio("Tourism", 1200000L);
    Portfolio[] portfolios = {portfolio1, portfolio2, portfolio3, portfolio4, portfolio5};

    Minister(String name, String ministry){
        this.name = name;
        this.ministry = ministry;
    }

    void display(){
        System.out.println("The name of Minister is : "+this.name);
        System.out.println("The name of ministry is : "+this.ministry);

        for(PersonalAssistant personalAssistant : personalAssistants){
            System.out.println("The Personal Assistant for Minister : "+this.name+ " is : "+personalAssistant.name);
            personalAssistant.display();
            System.out.println("=====================================================================================");
        }
        for(Portfolio portfolio : portfolios){
            System.out.println("The Portfolio for Minister : "+this.name+ " is : "+portfolio.name);
            portfolio.display();
            System.out.println("=====================================================================================");
        }
    }


}
