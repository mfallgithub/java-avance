package com.threads.cours;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println(Thread.currentThread().getName());
        List<Thread> threads = new ArrayList<>();
        List<Calculator> calculators = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            //Chaque thread doit avoir son propre calculateur
            Calculator calculator = new Calculator();
            Thread thread = new Thread(new Task(calculator));
            thread.start();
            threads.add(thread);
            calculators.add(calculator);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        var result = calculators
                .stream()
                .map(Calculator::getTotal)
                .reduce(Integer::sum)
                .get();
        System.out.println(result);

    }
}
