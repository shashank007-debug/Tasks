package com.xworkz.inheritance.internal.animal;

public class Cobra extends Snake {
    public void specialSnakeBehavior() {
        System.out.println("Cobra raises hood when threatened");
    }
    public void invokeAllSnakeMethods() {
        eat();
        sleep();
        move();
        breathe();
        makeSound(); }
    public void checkAndCast(Snake snake) {
        if (snake instanceof Cobra) {
            Cobra cobra = (Cobra) snake;
            System.out.println("Snake is Cobra. Casting successful.");
            cobra.specialSnakeBehavior();
        } else System.out.println("Snake is not a Cobra.");
    }
}
