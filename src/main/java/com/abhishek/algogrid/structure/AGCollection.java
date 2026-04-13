package com.abhishek.algogrid.structure;

public interface AGCollection<T> {
    boolean add(T element);

    boolean remove(T element);

    int size();

    boolean isEmpty();

    void clear();

    boolean contains(T element);

//    java.util.Iterator<T> iterator();

    boolean addAll(AGCollection<T> other);

    boolean removeAll(AGCollection<T> other);

    boolean containsAll(AGCollection<T> other);

    T[] toArray();
}
