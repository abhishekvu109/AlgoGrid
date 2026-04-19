package com.abhishek.algogrid.structure.linear;

import com.abhishek.algogrid.structure.*;

/**
 * A resizable array backed by a plain Object[].
 * Grows automatically when capacity is exceeded (typically by doubling).
 * Amortised O(1) append, O(1) random access, O(n) insert/remove at arbitrary index.
 * Equivalent to: java.util.ArrayList
 */
public class DynamicArray<E> implements Sequence<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] data;
    private int size;

    // ---- constructors -------------------------------------------------------

    public DynamicArray() {
        this.data = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public DynamicArray(int initialCapacity) {
        this.data = new Object[initialCapacity];
        this.size = 0;
    }

    // ---- internal helpers (implement these first) ---------------------------

    /** Doubles the backing array when capacity is reached. */
    private void grow() {
        // TODO: allocate a larger array and copy elements
    }

    private void rangeCheck(int index) {
        // TODO: throw IndexOutOfBoundsException if index is out of [0, size)
    }

    private void rangeCheckForAdd(int index) {
        // TODO: throw IndexOutOfBoundsException if index is out of [0, size]
    }

    // ---- Container ----------------------------------------------------------

    @Override public int size()                              { return 0; }
    @Override public boolean isEmpty()                      { return false; }
    @Override public boolean contains(Object o)             { return false; }
    @Override public boolean add(E e)                       { return false; }
    @Override public boolean remove(Object o)               { return false; }
    @Override public void clear()                           { }
    @Override public Object[] toArray()                     { return new Object[0]; }
    @Override public <T> T[] toArray(T[] a)                 { return null; }
    @Override public boolean containsAll(Container<?> c)    { return false; }
    @Override public boolean addAll(Container<? extends E> c) { return false; }
    @Override public boolean removeAll(Container<?> c)      { return false; }
    @Override public boolean retainAll(Container<?> c)      { return false; }

    // ---- Sequence -----------------------------------------------------------

    @Override public boolean addAll(int index, Container<? extends E> c) { return false; }
    @Override public E get(int index)                       { return null; }
    @Override public E set(int index, E element)            { return null; }
    @Override public void add(int index, E element)         { }
    @Override public E remove(int index)                    { return null; }
    @Override public int indexOf(Object o)                  { return -1; }
    @Override public int lastIndexOf(Object o)              { return -1; }
    @Override public Sequence<E> subSequence(int from, int to) { return null; }

    @Override
    public BidirectionalTraverser<E> traverser(int index) {
        return null; // TODO: return inner BidirectionalTraverser starting at index
    }

    @Override
    public Traverser<E> traverser() {
        return null; // TODO: return inner Traverser starting at index 0
    }

    // ---- inner traverser skeleton -------------------------------------------

    private class ArrayTraverser implements BidirectionalTraverser<E> {
        private int cursor;
        private int lastReturned = -1;

        ArrayTraverser(int index) { this.cursor = index; }

        @Override public boolean hasNext()      { return false; }
        @Override public E next()               { return null; }
        @Override public boolean hasPrevious()  { return false; }
        @Override public E previous()           { return null; }
        @Override public int nextIndex()        { return 0; }
        @Override public int previousIndex()    { return 0; }
        @Override public void set(E e)          { }
        @Override public void add(E e)          { }
    }
}
