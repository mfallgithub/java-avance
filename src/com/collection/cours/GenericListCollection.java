package com.collection.cours;

import java.util.Iterator;

public class GenericListCollection<T> implements Iterable<T> {
    public T[] items = (T[]) new Object[5];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {

        private GenericListCollection<T> list;
        private int iteratorIndex;

        public ListIterator(GenericListCollection<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return iteratorIndex < list.count;
        }

        @Override
        public T next() {
            return list.get(iteratorIndex++);
        }
    }
}
