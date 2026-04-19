package com.abhishek.algogrid.structure.linear;

import com.abhishek.algogrid.structure.*;

/**
 * A resizable circular-array implementation of the Deck interface.
 * O(1) amortised insert/remove at both ends. No null elements allowed.
 * Equivalent to: java.util.ArrayDeque
 */
public class ArrayDeck<E> implements Deck<E> {

    private static final int DEFAULT_CAPACITY = 16;

    /** Circular buffer; head and tail are indices into this array. */
    private Object[] elements;
    private int head;
    private int tail;
    private int size;

    // ---- constructors -------------------------------------------------------

    public ArrayDeck() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public ArrayDeck(int initialCapacity) {
        elements = new Object[initialCapacity];
    }

    // ---- internal helpers ---------------------------------------------------

    /** Grows the backing array (typically doubles capacity). */
    private void grow() {
        // TODO: allocate bigger array, copy with wrap-around, reset head/tail
    }

    /** Returns (index + 1) wrapping around the capacity. */
    private int inc(int index) {
        // TODO: return (index + 1) & (elements.length - 1)
        return 0;
    }

    /** Returns (index - 1) wrapping around the capacity. */
    private int dec(int index) {
        // TODO: return (index - 1) & (elements.length - 1)
        return 0;
    }

    // ---- Container ----------------------------------------------------------

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

    // ---- Deck ---------------------------------------------------------------

    @Override public void addFirst(E e)                        { }
    @Override public boolean offerFirst(E e)                   { return false; }
    @Override public E removeFirst()                           { return null; }
    @Override public E pollFirst()                             { return null; }
    @Override public E getFirst()                              { return null; }
    @Override public E peekFirst()                             { return null; }

    @Override public void addLast(E e)                         { }
    @Override public boolean offerLast(E e)                    { return false; }
    @Override public E removeLast()                            { return null; }
    @Override public E pollLast()                              { return null; }
    @Override public E getLast()                               { return null; }
    @Override public E peekLast()                              { return null; }

    @Override public void push(E e)                            { }
    @Override public E pop()                                   { return null; }

    @Override public boolean offer(E e)                        { return false; }
    @Override public E remove()                                { return null; }
    @Override public E poll()                                  { return null; }
    @Override public E element()                               { return null; }
    @Override public E peek()                                  { return null; }

    @Override public boolean removeFirstOccurrence(Object o)   { return false; }
    @Override public boolean removeLastOccurrence(Object o)    { return false; }

    @Override public Traverser<E> traverser()                  { return null; }
    @Override public Traverser<E> descendingTraverser()        { return null; }
}
