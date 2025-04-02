package com.xworkz.inheritance.internal.animal;

public class Kangaroo extends Animal {
    public void hop() {
        super.eat();
        super.sleep();
        super.move();
        super.breathe();
        super.makeSound();
        System.out.println("Kangaroo hopping");
    }
}