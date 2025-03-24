package com.xworkz.AccessModifier.Internal;

import com.xworkz.AccessModifier.External.Bank;

public class Accountant {
    Bank bank = new Bank();

    public void display() {
        bank.branch = "MG Road Branch";
        System.out.println("Accountant working at: " + bank.branch);
        bank.deposit();
        System.out.println("====================================");
    }
}
