package com.threads.cours;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MainClassThreads {

    public static void usingThreads() {
        //le nombre de threads actifs
        //System.out.println(Thread.activeCount());
        //combien de processus peuvent s'executer
        //System.out.println(Runtime.getRuntime().availableProcessors());
        // demarrer un thread
        //le nom du thread cree par java
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName());
//            Thread thread = new Thread(new Task());
//            thread.start();
//        }
        //Adhesion d'un Thread
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(Thread.currentThread().getName() + " finished");

        //Interruption d'un thread
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        thread.interrupt();

        //Concurrence entre les threads
//        System.out.println(Thread.currentThread().getName());
//        Calculator calculator = new Calculator();
//        List<Thread> threads= new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            Thread thread = new Thread(new Task(calculator));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread: threads){
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        calculator.displayTotal();

        //Gestion des concurrence

        //Strategie de confinement
//
//        System.out.println(Thread.currentThread().getName());
//        List<Thread> threads = new ArrayList<>();
//        List<Calculator> calculators = new ArrayList<>();
//
//        for (int i = 0; i < 5; i++) {
//            //Chaque thread doit avoir son propre calculateur
//            Calculator calculator = new Calculator();
//            Thread thread = new Thread(new Task(calculator));
//            thread.start();
//            threads.add(thread);
//            calculators.add(calculator);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        var result = calculators
//                .stream()
//                .map(Calculator::getTotal)
//                .reduce(Integer::sum)
//                .get();
//        System.out.println(result);
        // Appel strategie synchronized
//        System.out.println(Thread.currentThread().getName());
//        Calculator calculator = new Calculator();
//        List<Thread> threads = new ArrayList<>();
//
//        for (int i = 0; i < 5; i++) {
//            //Chaque thread doit avoir son propre calculateur
//            Thread thread = new Thread(new Task(calculator));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        calculator.displayTotal();

        //Appel strategie volatile

//        System.out.println(Thread.currentThread().getName());
//        Calculator calculator = new Calculator();
//
//        Thread thread1 = new Thread(new Task(calculator));
//
//        Thread thread2= new Thread(()->{
//            synchronized (calculator){
//                try {
//                    calculator.wait();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            //System.out.println("Finished");
//            calculator.displayTotal();
//        });
//        thread1.start();
//        thread2.start();

        //les objets atomiques

//        System.out.println(Thread.currentThread().getName());
//        Calculator calculator = new Calculator();
//        List<Thread> threads= new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            Thread thread = new Thread(new Task(calculator));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread: threads){
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        calculator.displayTotal();
//
//    }

        //synchronisation des collections

//        Collection<Integer> myCollection = Collections.synchronizedCollection(new ArrayList<>());
//
//        Thread thread1 = new Thread(() -> myCollection.addAll(List.of(1, 2, 3)));
//        Thread thread2 = new Thread(() -> myCollection.addAll(List.of(4, 5, 6)));
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(myCollection);

        // Concurrence sur les collections

        Map<String, Integer> myMap= new ConcurrentHashMap<>();
        myMap.put("one",1);
        myMap.put("two",2);
        myMap.get("one");
    }
}
