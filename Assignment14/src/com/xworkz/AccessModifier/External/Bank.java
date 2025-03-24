package com.xworkz.AccessModifier.External;

public class Bank {
    public String branch;
    String ifscCode;
    private double balance;

    public void deposit() {
        this.balance = 50000;
        System.out.println("Depositing amount, total balance: " + this.balance);
    }

    public void audit() {
        this.recalculate();
        System.out.println("Bank is under audit.");
    }

    private void recalculate() {
        System.out.println("Recalculating accounts internally.");
    }
}
