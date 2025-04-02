package com.xworkz.inheritance.internal.animal;

public class Bear extends Animal {
    public void hibernate() {
        super.eat();
        super.sleep();
        super.move();
        super.breathe();
        super.makeSound();
        System.out.println("Bear hibernating");
    }
}