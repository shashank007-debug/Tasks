package com.xworkz.inheritance.internal.animal;

public class Wolf extends Animal {
    public void howl() {
        super.eat();
        super.sleep();
        super.move();
        super.breathe();
        super.makeSound();
        System.out.println("Wolf howling");
    }
}