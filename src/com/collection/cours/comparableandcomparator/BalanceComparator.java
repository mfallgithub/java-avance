package com.collection.cours.comparableandcomparator;

import java.util.Comparator;

public class BalanceComparator implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount bankAccount1, BankAccount bankAccount2) {
        if (bankAccount1.getBalance() < bankAccount2.getBalance())
            return 1;
        else if (bankAccount1.getBalance() > bankAccount2.getBalance())
            return -1;
        else return 0;
    }
}
