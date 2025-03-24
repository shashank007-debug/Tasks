package com.xworkz.accessModifier.External;

public class Demon {
    public String eyes;
    String dress;
    private int legs;

    public void walk(){
        this.legs = 2;
        System.out.println("Wakling method in human : "+this.legs);
    }

    void sleep(){
        this.eat();
        System.out.println("sleep method in human");
    }
    private void eat(){
        System.out.println("Eat method in human");
    }
}
