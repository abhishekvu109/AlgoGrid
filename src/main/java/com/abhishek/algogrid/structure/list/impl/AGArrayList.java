package com.abhishek.algogrid.structure.list.impl;

import com.abhishek.algogrid.structure.AGCollection;
import com.abhishek.algogrid.structure.list.AGList;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class AGArrayList<T> implements AGList<T> {
    private T[] data;
    private int capacity;
    private int size;

    public AGArrayList() {
        this.capacity = 15;
        this.data = (T[]) new Object[capacity];
        this.size = 0;
    }

    public AGArrayList(T[] data, int capacity) {
        this.data = data;
        this.capacity = capacity;
    }

    public boolean add(T element) {
        return false;
    }

    public boolean remove(T element) {
        return false;
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public void clear() {

    }

    public boolean contains(T element) {
        return false;
    }

    public boolean addAll(AGCollection<T> other) {
        return false;
    }

    public boolean removeAll(AGCollection<T> other) {
        return false;
    }

    public boolean containsAll(AGCollection<T> other) {
        return false;
    }

    public T[] toArray() {
        return null;
    }

    public boolean add(int index, T element) {
        return false;
    }

    public T get(int index) {
        return null;
    }

    public T set(int index, T element) {
        return null;
    }

    public T remove(int index) {
        return null;
    }

    public int indexOf(T element) {
        return 0;
    }

    public int lastIndexOf(T element) {
        return 0;
    }
}
