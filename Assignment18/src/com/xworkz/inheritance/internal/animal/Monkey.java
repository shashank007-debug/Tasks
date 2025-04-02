package com.xworkz.inheritance.internal.animal;

public class Monkey extends Animal {
    public void climb() {
        super.eat();
        super.sleep();
        super.move();
        super.breathe();
        super.makeSound();
        System.out.println("Monkey climbing");
    }
}