package com.xworkz.country;

import javax.xml.soap.Detail;

public class Portfolio {
    String name;
    long budget;
    Details details1 = new Details();
    Details details2 = new Details();
    Details details3 = new Details();
    Details details4 = new Details();
    Details details5 = new Details();
    Details[] details = {details1, details2, details3, details4, details5};

    House house1 = new House();
    House house2 = new House();
    House house3 = new House();
    House house4 = new House();
    House house5 = new House();
    House[] houses = {house1, house2, house3, house4, house5};

    Portfolio(String name, long budget){
        this.name = name;
        this.budget = budget;
    }
    void display(){
        System.out.println("The name of Portfolio is : "+this.name);
        System.out.println("The budget of Portfolio is : "+this.budget);
        for(Details detail : details){
            System.out.println("Printing details of Portfolio name : "+this.name);
            detail.display();
        }
        for(House house : houses){
            System.out.println("Printing house of Portfolio name : "+this.name);
            house.display();
        }
    }
}
