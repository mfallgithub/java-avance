package com.collection.cours;

import java.util.ArrayDeque;
import java.util.Queue;

public class InterfaceQueue {
    public static void usingQueue() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(3);
        queue.add(2);
        queue.add(1);
        //3<-2<-2<-1
        //queue.offer(5); son equivqlent c'est add
        //var result = queue.peek();//element a la tete du file peek ou element
        var result = queue.remove();//suppression d'un element ou son equilalent poll
        System.out.println(result);
        System.out.println(queue);
    }
}
