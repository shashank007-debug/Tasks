package com.xworkz.encapsulation2;

import com.xworkz.encapsulation.Showroom;

public class Customer {
    void display(Showroom showroom){
        System.out.println("Running Display Method in Customer ...");
        System.out.println("Car Design is :"+showroom.getCarDesign());
        System.out.println("Car Key is : "+showroom.getKey());
        System.out.println("======================================");
    }
}
