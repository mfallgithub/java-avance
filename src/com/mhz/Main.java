package com.mhz;

import com.collection.cours.GenericListCollection;

public class Main {
    public static void main(String[] args) {
        GenericListCollection<Integer> list = new GenericListCollection<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer item : list)
            System.out.println(item);

    }
}