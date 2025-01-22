package com.collection.cours;

import com.collection.cours.comparableandcomparator.BankAccount;

import java.util.HashMap;
import java.util.Map;

public class InterfaceMap {

    public static void usingMap() {
        //les tables de hashage pour faire une recherche optimise
        BankAccount b1 = new BankAccount("holder1", 50, "email1");
        BankAccount b2 = new BankAccount("holder2", 150, "email2");

        Map<String, BankAccount> bankAccounts = new HashMap<>();
        bankAccounts.put(b1.getEmail(), b1);
        bankAccounts.put(b2.getEmail(), b2);

        //var bankAccount= bankAccounts.get("email1");
        // var bankAccount= bankAccounts.getOrDefault("email12", new BankAccount("unknownHolder"));// si on evite que cela retourne null
        //var containsKey = bankAccounts.containsKey("email1");//verifie si il contient une key specifique
//        System.out.println(bankAccounts);
//        bankAccounts.replace("email1", new BankAccount("holder3",850,"email1"));
//        System.out.println(bankAccounts);
     //afficher les keys ou les valeurs
//        for(var value: bankAccounts.values()){
//            System.out.println(value);
//        }

        //pour acceder key et value en meme temps
        for(var entry: bankAccounts.entrySet()){
            System.out.println(entry);
        }

    }
}
