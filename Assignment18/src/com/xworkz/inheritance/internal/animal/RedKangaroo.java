package com.xworkz.inheritance.internal.animal;

public class RedKangaroo extends Kangaroo {
    public void specialKangarooBehavior() {
        System.out.println("RedKangaroo uses tail for balance");
    }
    public void invokeAllKangarooMethods() {
        eat();
        sleep();
        move();
        breathe();
        makeSound();
    }
    public void checkAndCast(Kangaroo kangaroo) {
        if (kangaroo instanceof RedKangaroo) {
            RedKangaroo rk = (RedKangaroo) kangaroo;
            System.out.println("Kangaroo is RedKangaroo. Casting successful.");
            rk.specialKangarooBehavior();
        } else System.out.println("Kangaroo is not a RedKangaroo.");
    }
}