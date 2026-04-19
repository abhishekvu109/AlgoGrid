package com.abhishek.algogrid.structure;

/**
 * A Traverser that can move in both directions over a Sequence.
 * Equivalent to: java.util.ListIterator
 */
public interface BidirectionalTraverser<E> extends Traverser<E> {

    /** Returns true if there is a previous element. */
    boolean hasPrevious();

    /** Returns the previous element and moves the cursor backward. */
    E previous();

    /** Returns the index of the element that would be returned by {@link #next()}. */
    int nextIndex();

    /** Returns the index of the element that would be returned by {@link #previous()}. */
    int previousIndex();

    /** Replaces the last element returned by next/previous with the given element. */
    void set(E e);

    /** Inserts the given element immediately before the cursor position. */
    void add(E e);
}
