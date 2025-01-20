package com.genericite.exercice;

public class ExcercieFinal {

    public static void callExercice() {
        IGenericSet<Double> myGenericSet = new GenericSet<>(5);
        //add test
        myGenericSet.add(1.0);
        myGenericSet.add(1.1);
        myGenericSet.add(1.2);
        myGenericSet.add(1.3);
        myGenericSet.add(1.4);
        myGenericSet.add(1.5);
        myGenericSet.print();
        System.out.println("size=" + myGenericSet.getSize());

        // get test
        System.out.println("get 0 =" + myGenericSet.get(0));
        System.out.println("get 1 =" + myGenericSet.get(1));

        // remove test
        System.out.println("removing 1.2");
        myGenericSet.remove(1.2);
        myGenericSet.print();
        System.out.println("size =" + myGenericSet.getSize());

        //contains test

        System.out.println("contains 1.0 =" + myGenericSet.contains(1.0));
        System.out.println("contains 1.0 =" + myGenericSet.contains(4.0));

        // clear test
        System.out.println("clearing");
        myGenericSet.clear();
        myGenericSet.print();
    }

}
