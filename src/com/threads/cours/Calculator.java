package com.threads.cours;

import java.util.concurrent.atomic.AtomicInteger;

public class Calculator {

    //avec objet atomic
    private AtomicInteger total= new AtomicInteger();
   // private int total = 0;
    //private volatile int total = 0;
    // private Lock lock = new ReentrantLock();
    private Object totalLock= new Object();
    private Object counterLock= new Object();
    private int counter =0;
//    public void increment() {
//        //strategie de lock
////        lock.lock();
////        total++;
////        lock.unlock();
//        //strategie avec synchronized
//        synchronized (totalLock) {
//            total++;
//        }
//    }

    // ou bien

//    public synchronized void increment(){
//        total++;
//    }

    public void increment(){
       total.incrementAndGet();
   }

    public void increment2() {
        //strategie de lock
//        lock.lock();
//        total++;
//        lock.unlock();
        //strategie avec synchronized
        synchronized (counterLock) {
            counter++;
        }
    }

    public void displayTotal() {
        System.out.println("Total :" + total);
    }

    public int getTotal() {
        return total.get();
    }
}
