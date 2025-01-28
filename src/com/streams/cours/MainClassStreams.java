package com.streams.cours;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
//        List<BankAccount> bankAccounts = List.of(
//                new BankAccount("A", 20),
//                new BankAccount("B", 50),
//                new BankAccount("C", 100),
//                new BankAccount("D", -20));
        //afficher le noms des proprietqires ayant un solde negatif
//        bankAccounts
//                .stream()
//                .filter(bankAccount -> bankAccount.getBalance() < 0)
//                .map(BankAccount::getHolder)
//                .forEach(System.out::println);

        //Slicing
//        List<BankAccount> bankAccounts = List.of(
//               new BankAccount("A", 20),
//                new BankAccount("C", -100),
//               new BankAccount("B", 50));
//
//        bankAccounts
//                .stream()
        //.limit(2) 1 ere methode
        //.skip(2) // 2 eme methode
        // .takeWhile(bankAccount -> bankAccount.getBalance()>0) // 3 eme methode
//                .dropWhile(bankAccount -> bankAccount.getBalance()>0)
//                .forEach(bankAccount -> System.out.println(bankAccount.getHolder()));

        //Tri avec streams
//        List<BankAccount> bankAccounts = List.of(
//                new BankAccount("A", 50),
//                new BankAccount("C", -100),
//                new BankAccount("B", 150)
//        );
//        bankAccounts
//                .stream()
        //.sorted((a,b)->Double.compare(a.getBalance(),b.getBalance())) // 1ere methode
        //.sorted(Comparator.comparingDouble(BankAccount::getBalance)) // 2 meth plus simple
//                .sorted(Comparator.comparingDouble(BankAccount::getBalance).reversed()) // 3 meth avec inversion du resultat
//                .forEach(bankAccount -> System.out.println(bankAccount.getHolder()));

        // Differenciation des elements au sein d'un streams
//        bankAccounts
//                .stream()
//                .map(BankAccount::getHolder)
//                .distinct()
//                .forEach(System.out::println);

        //Observation des elements
//        bankAccounts
//                .stream()
//                .filter(bankAccount -> bankAccount.getBalance() > 0)
//                .peek(bankAccount -> System.out.println("Filter: " + bankAccount.getHolder()))
//                .map(BankAccount::getHolder)
//                .peek(holder -> System.out.println("Map: " + holder))
//                .forEach(System.out::println);

        //Reducers

//        var result = bankAccounts
//                .stream()
        //.count(); reducer
        //.anyMatch(bankAccount -> bankAccount.getBalance()<0); // s'il existe un element qui respecte ce Predicat
        //.allMatch(bankAccount -> bankAccount.getBalance()<0); // est-ce que tous les elements respectent ce predicat
        //.noneMatch(bankAccount -> bankAccount.getBalance()<0); // est-ce que tous les elements ne respectent ce predicat
//                recuperer le premier element
//                .findFirst()
//                .get()
//                .getHolder();
        //qui le plus grand solde ou le plus petit
        //.max(Comparator.comparingDouble(BankAccount::getBalance))
//                .min(Comparator.comparingDouble(BankAccount::getBalance))
//                .get()
//                .getHolder();
//        System.out.println(result);

        //Reduction de streams

//        var result= bankAccounts
//                .stream()
//                .map(BankAccount::getBalance)
//                //.reduce((a,b)->a+b) 1 ere meth
//                .reduce(Double::sum) // grace à la reduction des streams
//                .get();
//        System.out.println(result);

        // Interface Collecters pour reduire un stream à une collection

//        var result = bankAccounts
//                .stream()
//                .filter(bankAccount -> bankAccount.getBalance() > 0)
        //.collect(Collectors.toList()) //Pour une liste
        //.collect(Collectors.toSet()); //pou un set
        //.collect(Collectors.toMap(BankAccount::getHolder, BankAccount::getBalance));
        //.collect(Collectors.summarizingDouble(BankAccount::getBalance));
        //.map(BankAccount::getHolder)
        //.collect(Collectors.joining(", "));
//                .collect(Collectors.joining());
//        System.out.println(result);

        // Groupement des elements en se basant sur le type de compte bancaire

        List<BankAccount> bankAccounts = List.of(
                new BankAccount("A", 50, BankAccountType.SAVINGS),
                new BankAccount("C", -100, BankAccountType.CURRENT),
                new BankAccount("B", 150, BankAccountType.SAVINGS)
        );
//        var result = bankAccounts
//                .stream()
//                .collect(Collectors
//                        //.groupingBy(BankAccount::getBankAccountType, Collectors.counting()));
//                        .groupingBy(BankAccount::getBankAccountType,
//                                Collectors.mapping(BankAccount::getHolder, Collectors.joining(", "))));
//        System.out.println(result);
        //Partitionnement des elements

//        var result = bankAccounts
//                .stream()
//                .collect(Collectors.partitioningBy(b -> b.getBalance() > 0,
//                        Collectors.mapping(BankAccount::getHolder,
//                                Collectors.joining(", "))));
//        System.out.println(result);

        //Les streams de type primitifs
        IntStream
                //.rangeClosed(1,10)
                .range(1,10)
                .forEach(System.out::println);



    }
}
