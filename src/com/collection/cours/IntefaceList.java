package com.collection.cours;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntefaceList {
    public static void usingListExample(){
        List<String> myCollection= new ArrayList<>();
        Collections.addAll(myCollection, "A","B","C","B");
        myCollection.remove(1);
        System.out.println(myCollection.subList(0,2));
    }
}
