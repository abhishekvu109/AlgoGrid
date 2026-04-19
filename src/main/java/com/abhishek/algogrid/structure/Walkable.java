package com.abhishek.algogrid.structure;

/**
 * Marks a collection as capable of providing a Traverser over its elements.
 * Equivalent to: java.lang.Iterable
 */
public interface Walkable<E> {

    /** Returns a Traverser over the elements of this collection. */
    Traverser<E> traverser();
}
