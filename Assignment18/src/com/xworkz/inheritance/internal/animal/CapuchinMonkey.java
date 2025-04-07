package com.xworkz.inheritance.internal.animal;

public class CapuchinMonkey extends Monkey {
    public void specialMonkeyBehavior() {
        System.out.println("CapuchinMonkey uses tools");
    }
    public void invokeAllMonkeyMethods() {
        eat();
        sleep();
        move();
        breathe();
        makeSound(); }
    public void checkAndCast(Monkey monkey) {
        if (monkey instanceof CapuchinMonkey) {
            CapuchinMonkey cm = (CapuchinMonkey) monkey;
            System.out.println("Monkey is CapuchinMonkey. Casting successful.");
            cm.specialMonkeyBehavior();
        } else System.out.println("Monkey is not a CapuchinMonkey.");
    }
}