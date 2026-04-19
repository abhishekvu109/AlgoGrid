package com.abhishek.algogrid.structure;

/**
 * An ordered Container that allows positional (index-based) access to elements.
 * Duplicate elements are permitted.
 * Equivalent to: java.util.List
 */
public interface Sequence<E> extends Container<E> {

    /**
     * Inserts all elements of the given container starting at the specified index.
     * Returns true if this sequence changed as a result.
     */
    boolean addAll(int index, Container<? extends E> c);

    /** Returns the element at the specified position. */
    E get(int index);

    /** Replaces the element at the specified position with the given element. */
    E set(int index, E element);

    /** Inserts the given element at the specified position, shifting subsequent elements right. */
    void add(int index, E element);

    /** Removes and returns the element at the specified position, shifting subsequent elements left. */
    E remove(int index);

    /** Returns the index of the first occurrence of the given element, or -1 if not found. */
    int indexOf(Object o);

    /** Returns the index of the last occurrence of the given element, or -1 if not found. */
    int lastIndexOf(Object o);

    /** Returns a BidirectionalTraverser starting at the specified index. */
    BidirectionalTraverser<E> traverser(int index);

    /** Returns a view of the portion of this sequence between fromIndex (inclusive) and toIndex (exclusive). */
    Sequence<E> subSequence(int fromIndex, int toIndex);
}
