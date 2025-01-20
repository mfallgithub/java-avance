package com.exception;

public class BankAccount {
    private double balance;

    public void deposit(double amount) throws BankAccountException {
        if(amount <=0)
          throw new BankAccountException(new InvalidAmounException());
        balance += amount;
    }
}
