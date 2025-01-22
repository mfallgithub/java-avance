package com.collection.cours;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class InterfaceCollection {

    public static void usingCollection(){
        Collection<Integer> myCollection = new ArrayList<>();
        Collections.addAll(myCollection, 1, 2, 3);
        Collection<Integer> other= new ArrayList<>();
        other.addAll(myCollection);
        System.out.println(myCollection==other);
        System.out.println(myCollection.equals(other));
    }
}
