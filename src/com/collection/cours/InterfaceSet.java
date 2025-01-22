package com.collection.cours;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InterfaceSet {

    public static void usingSet() {
        //Enlever les doubles
        //List<Integer> list= Arrays.asList(1,2,4,4);
        //Set<Integer> set= new HashSet<>(list);
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        //union
//        set1.addAll(set2);
//        System.out.println(set1);
        //Intersection
        //set1.retainAll(set2);
        //Difference
        set1.removeAll(set2);
        System.out.println(set1);

    }
}
