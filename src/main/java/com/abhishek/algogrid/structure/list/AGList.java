package com.abhishek.algogrid.structure.list;

import com.abhishek.algogrid.structure.AGCollection;

public interface AGList<T> extends AGCollection<T> {

    boolean add(int index, T element);

    T get(int index);

    T set(int index, T element);

    T remove(int index);

    int indexOf(T element);

    int lastIndexOf(T element);

}
