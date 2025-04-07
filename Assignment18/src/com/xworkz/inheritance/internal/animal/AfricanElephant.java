package com.xworkz.inheritance.internal.animal;

public class AfricanElephant extends Elephant {
    public void specialElephantBehavior() {
        System.out.println("AfricanElephant flaps ears to cool down");
    }
    public void invokeAllElephantMethods() {
        eat();
        sleep();
        move();
        breathe();
        makeSound();
    }
    public void checkAndCast(Elephant elephant) {
        if (elephant instanceof AfricanElephant) {
            AfricanElephant ae = (AfricanElephant) elephant;
            System.out.println("Elephant is AfricanElephant. Casting successful.");
            ae.specialElephantBehavior();
        } else System.out.println("Elephant is not an AfricanElephant.");
    }
}