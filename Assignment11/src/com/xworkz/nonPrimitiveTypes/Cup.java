package com.xworkz.nonPrimitiveTypes;

public class Cup {
    void won(RCB rcb) {
        if (rcb != null) {
            rcb.playMatch();
            rcb.practice();
            System.out.println("RCB won the Cup!");
        } else {
            System.out.println("No RCB team available to play.");
        }
    }

}
