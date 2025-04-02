package com.xworkz.inheritance.internal.animal;

public class Dog extends Animal {
    public void bark() {
        super.eat();
        super.sleep();
        super.move();
        super.breathe();
        super.makeSound();
        System.out.println("Dog barking");
    }
}