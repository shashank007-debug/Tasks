package com.xworkz.accessModifier.External;

public class Ghost {
    Demon demon = new Demon();
    public void display(){
        demon.dress = "Black";
        System.out.println("Display method in Ghost : "+demon.dress);
        demon.sleep();
        demon.walk();
        System.out.println("==================================================");
    }

}
