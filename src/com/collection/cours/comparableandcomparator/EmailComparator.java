package com.collection.cours.comparableandcomparator;

import java.util.Comparator;

public class EmailComparator implements Comparator<BankAccount> {
    @Override
    public int compare(BankAccount bankAccount1, BankAccount bankAccount2) {
        return bankAccount1.getEmail().compareTo(bankAccount2.getEmail());
    }
}
