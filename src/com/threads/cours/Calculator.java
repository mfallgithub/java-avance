package com.threads.cours;

public class Calculator {
    private int total = 0;


    public void increment() {
        total++;
    }

    public void displayTotal() {
        System.out.println("Total :" + total);
    }

    public int getTotal() {
        return total;
    }
}
