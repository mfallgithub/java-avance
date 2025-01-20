package com.genericite.cours;

public class Utils {
    public static <T extends Comparable<T>> T min(T first, T second) {
        return (first.compareTo(second) < 0) ? first : second;
    }

    public static <K, V> void printKeyValue(K key, V value) {
        System.out.println(key + "=" + value);
    }

    public static void printBankAccount(BankAccount bankAccount) {
        System.out.println(bankAccount);
    }

    //prend en compte les objet des classes filles de BankAccount
    public static void printBankAccounts(GenericList<? extends BankAccount> bankAccounts) {
    }
    //prend en compte les objet des classes meres de BankAccount
//    public static void printBankAccounts(GenericList<? super BankAccount> bankAccounts) {
//    }
//si on veut prendre en compte tous les types
    //    public static void printBankAccounts(GenericList<?> bankAccounts) {
//    }
}
