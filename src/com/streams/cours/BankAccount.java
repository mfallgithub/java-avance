package com.streams.cours;

public class BankAccount {

    private String holder;
    private double balance;

    public BankAccount(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }
}
