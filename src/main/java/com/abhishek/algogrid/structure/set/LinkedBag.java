package com.abhishek.algogrid.structure.set;

import com.abhishek.algogrid.structure.*;

/**
 * A hash-table backed Bag that additionally maintains a doubly-linked list
 * of all entries in insertion order.
 * O(1) average add/remove/contains; iteration is in insertion order.
 * Equivalent to: java.util.LinkedHashSet
 */
public class LinkedBag<E> implements Bag<E> {

    private static final int   DEFAULT_CAPACITY    = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    /**
     * Each slot is a chain of LinkedNodes; the before/after pointers form
     * a separate doubly-linked list that tracks insertion order.
     */
    private LinkedNode<E>[] table;
    private LinkedNode<E>   listHead;   // oldest inserted element
    private LinkedNode<E>   listTail;   // most recently inserted element
    private int size;
    private final float loadFactor;

    // ---- node ---------------------------------------------------------------

    private static class LinkedNode<E> {
        E element;
        int hash;
        LinkedNode<E> next;       // hash-chain next
        LinkedNode<E> before;     // insertion-order predecessor
        LinkedNode<E> after;      // insertion-order successor

        LinkedNode(E element, int hash) {
            this.element = element;
            this.hash    = hash;
        }
    }

    // ---- constructors -------------------------------------------------------

    @SuppressWarnings("unchecked")
    public LinkedBag() {
        this.table      = new LinkedNode[DEFAULT_CAPACITY];
        this.loadFactor = DEFAULT_LOAD_FACTOR;
    }

    // ---- internal helpers ---------------------------------------------------

    private int hash(Object o)          { return 0; /* TODO */ }
    private int bucketIndex(int hash)   { return 0; /* TODO */ }
    private void resize()               { /* TODO */ }

    /** Appends node to the tail of the insertion-order linked list. */
    private void linkToTail(LinkedNode<E> node) { /* TODO */ }

    /** Removes node from the insertion-order linked list. */
    private void unlinkFromList(LinkedNode<E> node) { /* TODO */ }

    // ---- Container / Bag ----------------------------------------------------

    @Override public int size()                                { return 0; }
    @Override public boolean isEmpty()                         { return false; }
    @Override public boolean contains(Object o)                { return false; }
    @Override public boolean add(E e)                          { return false; }
    @Override public boolean remove(Object o)                  { return false; }
    @Override public void clear()                              { }
    @Override public Object[] toArray()                        { return new Object[0]; }
    @Override public <T> T[] toArray(T[] a)                   { return null; }
    @Override public boolean containsAll(Container<?> c)       { return false; }
    @Override public boolean addAll(Container<? extends E> c)  { return false; }
    @Override public boolean removeAll(Container<?> c)         { return false; }
    @Override public boolean retainAll(Container<?> c)         { return false; }

    @Override
    public Traverser<E> traverser() {
        return null; // TODO: walk the insertion-order doubly-linked list
    }

    // ---- inner traverser skeleton -------------------------------------------

    private class LinkedBagTraverser implements Traverser<E> {
        private LinkedNode<E> current;

        LinkedBagTraverser() { this.current = listHead; }

        @Override public boolean hasNext() { return false; }
        @Override public E next()          { return null; }
    }
}
