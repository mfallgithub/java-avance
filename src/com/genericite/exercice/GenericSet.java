package com.genericite.exercice;

import java.util.Arrays;
import java.util.Objects;

public class GenericSet<T> implements IGenericSet<T> {

    private int length;
    private T[] items;
    private int count;

    public GenericSet(int length) {
        this.length = length;
        this.items = (T[]) new Object[length];
    }

    @Override
    public void add(T item) {
        for (var tmpItem : items) {
            if (Objects.equals(tmpItem, item))
                return;
        }
        if (count < length)
            items[count++] = item;
    }

    @Override
    public void remove(T item) {
        for (int i = 0; i < length; i++) {
            if (Objects.equals(items[i], item)) {
                int tmpIndex = i;
                while ((tmpIndex + 1) < length) {
                    items[tmpIndex] = items[tmpIndex + 1];
                    tmpIndex++;
                }
                items[tmpIndex] = null;
                count--;
            }
        }
    }

    @Override
    public T get(int index) {
        return items[index];
    }

    @Override
    public void clear() {
        this.items = (T[]) new Object[length];
    }

    @Override
    public boolean contains(T item) {
        for (var tmpItem: items){
           if(Objects.equals(tmpItem,item))
               return true;
        }
        return false;
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(items));
    }
}
