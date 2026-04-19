package com.abhishek.algogrid.structure.linear;

import com.abhishek.algogrid.structure.Traverser;

/**
 * A LIFO stack backed by a resizable array.
 * Faster and preferred over the legacy java.util.Stack which extends Vector.
 * Equivalent to: java.util.Stack  (but without the flawed inheritance)
 */
public class ArrayStack<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] data;
    private int top; // index of the next free slot

    // ---- constructors -------------------------------------------------------

    public ArrayStack() {
        this.data = new Object[DEFAULT_CAPACITY];
        this.top = 0;
    }

    public ArrayStack(int initialCapacity) {
        this.data = new Object[initialCapacity];
        this.top = 0;
    }

    // ---- internal helpers ---------------------------------------------------

    private void grow() {
        // TODO: double the array capacity and copy elements
    }

    // ---- core operations ----------------------------------------------------

    /** Pushes an element onto the top of the stack. */
    public void push(E e) {
        // TODO
    }

    /**
     * Removes and returns the top element.
     * Throws java.util.EmptyStackException (or your own) if empty.
     */
    @SuppressWarnings("unchecked")
    public E pop() {
        // TODO
        return null;
    }

    /**
     * Returns (without removing) the top element.
     * Throws if empty.
     */
    @SuppressWarnings("unchecked")
    public E peek() {
        // TODO
        return null;
    }

    /** Returns true if the stack contains no elements. */
    public boolean isEmpty() {
        return false; // TODO
    }

    /** Returns the number of elements on the stack. */
    public int size() {
        return 0; // TODO
    }

    /**
     * Returns the 1-based position of the element from the top.
     * Returns -1 if not found. Equivalent to java.util.Stack#search.
     */
    public int search(Object o) {
        return -1; // TODO
    }

    /** Returns a Traverser from top to bottom. */
    public Traverser<E> traverser() {
        return null; // TODO: return inner top-down Traverser
    }

    // ---- inner traverser skeleton -------------------------------------------

    private class StackTraverser implements Traverser<E> {
        private int cursor;

        StackTraverser() { this.cursor = top - 1; }

        @Override public boolean hasNext() { return false; }
        @Override public E next()          { return null; }
    }
}
