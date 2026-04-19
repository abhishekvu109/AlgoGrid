package com.abhishek.algogrid.structure;

/**
 * A cursor for stepping through elements of a collection one at a time.
 * Equivalent to: java.util.Iterator
 */
public interface Traverser<E> {

    /** Returns true if there are more elements to traverse. */
    boolean hasNext();

    /** Returns the next element and advances the cursor. */
    E next();

    /** Removes the last element returned by {@link #next()} from the underlying collection. */
    default void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }
}
