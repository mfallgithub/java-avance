package com.genericite.exercice;

public interface IGenericSet<T> {

    void add(T item);
    void remove(T item);
    T get(int index);
    void clear();
    boolean contains(T item);
    int getSize();
    void print();
}
