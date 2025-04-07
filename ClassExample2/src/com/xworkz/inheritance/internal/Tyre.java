package com.xworkz.inheritance.internal;

public class Tyre extends Rubber{
    @Override
    public void expand(){
        System.out.println("Running expand in Tyre");
    }
    public void compress(){
        System.out.println("Running compress in Tyre");
    }
}
