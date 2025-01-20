package com.exception;

public class MyBankApplication {
    public static void start() {
        BankAccount bankAccount= new BankAccount();
        try {
            bankAccount.deposit(-90);
        } catch (BankAccountException e) {
            System.out.println(e.getCause().getMessage());
        }
    }
}
