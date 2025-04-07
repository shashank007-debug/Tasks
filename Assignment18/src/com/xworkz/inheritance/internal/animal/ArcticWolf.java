package com.xworkz.inheritance.internal.animal;

public class ArcticWolf extends Wolf {
    public void specialWolfBehavior() {
        System.out.println("ArcticWolf has thick white fur");
    }
    public void invokeAllWolfMethods() {
        eat();
        sleep();
        move();
        breathe();
        makeSound(); }
    public void checkAndCast(Wolf wolf) {
        if (wolf instanceof ArcticWolf) {
            ArcticWolf aw = (ArcticWolf) wolf;
            System.out.println("Wolf is ArcticWolf. Casting successful.");
            aw.specialWolfBehavior();
        } else System.out.println("Wolf is not an ArcticWolf.");
    }
}