package com.xworkz.inheritance.internal.animal;

public class EmperorPenguin extends Penguin {
    public void specialPenguinBehavior() {
        System.out.println("EmperorPenguin slides on ice");
    }
    public void invokeAllPenguinMethods() {
        eat();
        sleep();
        move();
        breathe();
        makeSound(); }
    public void checkAndCast(Penguin penguin) {
        if (penguin instanceof EmperorPenguin) {
            EmperorPenguin ep = (EmperorPenguin) penguin;
            System.out.println("Penguin is EmperorPenguin. Casting successful.");
            ep.specialPenguinBehavior();
        } else System.out.println("Penguin is not an EmperorPenguin.");
    }
}