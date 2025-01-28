package com.streams.cours;

public class BankAccount {

    private String holder;
    private double balance;
    private BankAccountType bankAccountType;


    public BankAccount(String holder, double balance, BankAccountType bankAccountType) {
        this.holder = holder;
        this.balance = balance;
        this.bankAccountType = bankAccountType;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }
}
