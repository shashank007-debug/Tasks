package com.xworkz.inheritance.internal.animal;

public class StreetDog extends Dog {

    public void specialStreetDogBehavior() {
        System.out.println("Running specialStreetDogBehavior in StreetDog");
    }

    public void invokeAllDogMethods() {
        this.eat();
        this.sleep();
        this.move();
        this.breathe();
        this.makeSound();
    }

    public void checkAndCast(Dog dog) {
        if (dog instanceof StreetDog) {
            StreetDog streetDog = (StreetDog) dog;
            System.out.println("Dog is an instance of StreetDog. Casting successful.");
            streetDog.specialStreetDogBehavior();
        } else {
            System.out.println("Dog is not an instance of StreetDog.");
        }
    }
}
