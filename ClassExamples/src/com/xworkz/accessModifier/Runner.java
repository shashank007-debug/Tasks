package com.xworkz.accessModifier;

import com.xworkz.accessModifier.External.Ghost;
import com.xworkz.accessModifier.Internal.Human;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human();
        human.display();
        Ghost ghost = new Ghost();
        ghost.display();
    }
}
