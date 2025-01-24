package com.streams.cours;

import java.util.List;

public class MainClassStreams {

    public static void usingStreams() {
//
//        List<BankAccount> bankAccounts= List.of(
//                new BankAccount("A", 50),
//                new BankAccount("B", 80),
//                new BankAccount("C", -80));

        //Imperative -> How
//        var count1=0;
//        for(var bankAccount: bankAccounts){
//            if(bankAccount.getBalance()<0)
//                count1++;
//        }

        //Declarative -> What
//        var count2= bankAccounts.stream()
//                .filter(bankAccount -> bankAccount.getBalance()<0)
//                .count();
        //exemple de creation de streams
        // Stream<Integer>stream=Stream.of(1,2,3,4);
        //1 ere facon: Creation de stream  infinie
//        Stream<Double> stream= Stream.generate(Math::random);
//        stream
//                .limit(5)
//                .forEach(System.out::println);

        //2 ere facon: Creation de stream  infinie
//        Stream.iterate(1, x->x+1)
//                .limit(20)
//                .forEach(System.out::println);

        //le mapping d'elements
//        bankAccounts.stream()
//                .map(BankAccount::getHolder)
//                .forEach(System.out::println);

        //Mapping avec utilisation de FlatMap

//        List<List<BankAccount>> bankAccounts = List.of(
//                List.of(
//                        new BankAccount("A", 50),
//                        new BankAccount("B", 80),
//                        new BankAccount("C", -80)),
//                List.of(
//                        new BankAccount("D", 20),
//                        new BankAccount("E", 50),
//                        new BankAccount("F", 100)
//                )
//        );
//
//        bankAccounts
//                .stream()
//                .flatMap(Collection::stream)
//                .map(BankAccount::getHolder)
//                .forEach(System.out::println);

        //Filtrage d'elements avec les streams
        List<BankAccount> bankAccounts = List.of(
                new BankAccount("A", 20),
                new BankAccount("B", 50),
                new BankAccount("C", 100),
                new BankAccount("D", -20));
        //afficher le noms des proprietqires ayant un solde negatif
        bankAccounts
                .stream()
                .filter(bankAccount -> bankAccount.getBalance() < 0)
                .map(BankAccount::getHolder)
                .forEach(System.out::println);

    }
}
