package com.collection.cours.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterfaceComparableAndComparator {

    public static void usingComparableAndComparator(){
        List<BankAccount> bankAccounts= new ArrayList<>();
        bankAccounts.add(new BankAccount("Jack",89,"e2"));
        bankAccounts.add(new BankAccount("Christophe",50,"e3"));
        bankAccounts.add(new BankAccount("Alice",15,"e1"));
        //trie
        //Collections.sort(bankAccounts); based on the name
        //based on the email or balance
        Collections.sort(bankAccounts, new BalanceComparator());
        System.out.println(bankAccounts);
    }
}
