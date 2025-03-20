package com.xworkz.classesAsInstanceVariable;

public class Clip {
    String color;
    Clip(String color ){
        this.color = color;
    }

    void hold(){
        System.out.println("Running hold method in Clip of Color : "+this.color);
    }


}
