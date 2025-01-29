package com.threads.cours;

public class Task implements Runnable {

    private Calculator calculator;

    public Task(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        System.out.println("Thread started : " + Thread.currentThread().getName());
        //Mise en pause d'un thread
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            if (Thread.currentThread().isInterrupted())
//                break;
//            System.out.println("Progressing");
//        }
        for(int i=0;i<5000;i++)
            calculator.increment();
        System.out.println("Thread finished : " + Thread.currentThread().getName());

    }
}
