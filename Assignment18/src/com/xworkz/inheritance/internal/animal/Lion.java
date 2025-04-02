package com.xworkz.inheritance.internal.animal;

public class Lion extends Animal {
    public void roar() {
        super.eat();
        super.sleep();
        super.move();
        super.breathe();
        super.makeSound();
        System.out.println("Lion roaring");
    }
}