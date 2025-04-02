package com.xworkz.inheritance.internal.animal;

public class Penguin extends Animal {
    public void slide() {
        super.eat();
        super.sleep();
        super.move();
        super.breathe();
        super.makeSound();
        System.out.println("Penguin sliding");
    }
}