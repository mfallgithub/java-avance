package com.genericite.cours;

public class BankAccount implements Comparable<BankAccount>, Cloneable {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(BankAccount bankAccount) {
        return (int) (balance - bankAccount.balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
