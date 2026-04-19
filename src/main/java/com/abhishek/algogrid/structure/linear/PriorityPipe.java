package com.abhishek.algogrid.structure.linear;

import com.abhishek.algogrid.structure.*;

import java.util.Comparator;

/**
 * A Pipe whose head is always the element with the highest priority.
 * Priority is determined by natural ordering or a supplied Comparator.
 * Backed internally by a binary min-heap (or max-heap with reversed comparator).
 * Equivalent to: java.util.PriorityQueue
 */
public class PriorityPipe<E> implements Pipe<E> {

    private static final int DEFAULT_CAPACITY = 11;

    private Object[] heap;          // 1-indexed; heap[0] unused
    private int size;
    private final Comparator<? super E> comparator;

    // ---- constructors -------------------------------------------------------

    public PriorityPipe() {
        this(DEFAULT_CAPACITY, null);
    }

    public PriorityPipe(int initialCapacity) {
        this(initialCapacity, null);
    }

    public PriorityPipe(Comparator<? super E> comparator) {
        this(DEFAULT_CAPACITY, comparator);
    }

    public PriorityPipe(int initialCapacity, Comparator<? super E> comparator) {
        this.heap = new Object[initialCapacity + 1];
        this.comparator = comparator;
    }

    // ---- internal heap operations -------------------------------------------

    /** Bubbles element at index i up toward the root to restore heap order. */
    private void siftUp(int i) {
        // TODO
    }

    /** Pushes element at index i down toward the leaves to restore heap order. */
    private void siftDown(int i) {
        // TODO
    }

    /** Compares elements at heap indices a and b using comparator or natural order. */
    @SuppressWarnings("unchecked")
    private int compare(int a, int b) {
        // TODO
        return 0;
    }

    private void grow() {
        // TODO: double backing array
    }

    // ---- Container ----------------------------------------------------------

    @Override public int size()                                { return 0; }
    @Override public boolean isEmpty()                         { return false; }
    @Override public boolean contains(Object o)                { return false; }
    @Override public boolean remove(Object o)                  { return false; }
    @Override public void clear()                              { }
    @Override public Object[] toArray()                        { return new Object[0]; }
    @Override public <T> T[] toArray(T[] a)                   { return null; }
    @Override public boolean containsAll(Container<?> c)       { return false; }
    @Override public boolean addAll(Container<? extends E> c)  { return false; }
    @Override public boolean removeAll(Container<?> c)         { return false; }
    @Override public boolean retainAll(Container<?> c)         { return false; }
    @Override public Traverser<E> traverser()                  { return null; }

    // ---- Pipe ---------------------------------------------------------------

    /** Inserts the element and restores heap order via siftUp. */
    @Override public boolean add(E e)                          { return false; }
    @Override public boolean offer(E e)                        { return false; }

    /** Removes and returns the head (highest-priority element). */
    @Override public E remove()                                { return null; }
    @Override public E poll()                                  { return null; }

    /** Returns the head without removing it. */
    @Override public E element()                               { return null; }
    @Override public E peek()                                  { return null; }
}
