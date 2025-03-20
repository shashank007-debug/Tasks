package com.xworkz.classesAsInstanceVariable;

import java.awt.*;

public class Brush {
    Color color;
    Brush(Color color){
        this.color = color;
    }
    void clean(){
        System.out.println("Running Clean Method in Brush");
    }
    void scrub(){
        System.out.println("Running Scrub Method in Brush");
    }
}
