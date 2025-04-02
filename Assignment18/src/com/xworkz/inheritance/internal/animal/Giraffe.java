package com.xworkz.inheritance.internal.animal;

public class Giraffe extends Animal {
    public void stretch() {
        super.eat();
        super.sleep();
        super.move();
        super.breathe();
        super.makeSound();
        System.out.println("Giraffe stretching");
    }
}