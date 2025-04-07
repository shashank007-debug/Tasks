package com.xworkz.inheritance.internal.animal;

public class GrizzlyBear extends Bear {

    public void specialGrizzlyBehavior() {
        System.out.println("Running specialGrizzlyBehavior in GrizzlyBear");
    }

    public void invokeAllBearMethods() {
        this.eat();
        this.sleep();
        this.move();
        this.breathe();
        this.makeSound();
    }

    public void checkAndCast(Bear bear) {
        if (bear instanceof GrizzlyBear) {
            GrizzlyBear grizzly = (GrizzlyBear) bear;
            System.out.println("Bear is an instance of GrizzlyBear. Casting successful.");
            grizzly.specialGrizzlyBehavior();
        } else {
            System.out.println("Bear is not an instance of GrizzlyBear.");
        }
    }
}
