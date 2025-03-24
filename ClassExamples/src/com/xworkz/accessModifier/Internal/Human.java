package com.xworkz.accessModifier.Internal;
import com.xworkz.accessModifier.External.Demon;
public class Human {
    Demon demon = new Demon();
    public void display(){
        System.out.println("display method in Human");
        demon.eyes = "Brown";
        System.out.println("Intializing value to eyes : "+demon.eyes);
        demon.walk();
        System.out.println("=================================================");
    }
}
