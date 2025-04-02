package com.xworkz.inheritance.internal.animal;

public class Fish extends Animal {
    public void swim() {
        super.eat();
        super.sleep();
        super.move();
        super.breathe();
        super.makeSound();
        System.out.println("Fish swimming");
    }
}