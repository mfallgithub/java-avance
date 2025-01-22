package com.collection.cours.comparableandcomparator;

public class BankAccount implements Comparable<BankAccount>{
    private String holder;
    private double balance;
    private String email;

    public BankAccount(String holder) {
        this.holder = holder;
    }

    public BankAccount(String holder, double balance, String email) {
        this.holder = holder;
        this.balance = balance;
        this.email = email;
    }

    @Override
    public int compareTo(BankAccount other) {
        return holder.compareTo(other.holder);
    }

    @Override
    public String toString() {
        return holder;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }
}
