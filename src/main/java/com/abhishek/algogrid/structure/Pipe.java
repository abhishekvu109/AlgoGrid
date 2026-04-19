package com.abhishek.algogrid.structure;

/**
 * A Container for holding elements prior to processing, typically FIFO.
 * Provides two forms for each operation: one throws on failure, one returns a sentinel.
 * Equivalent to: java.util.Queue
 */
public interface Pipe<E> extends Container<E> {

    /** Inserts the element, returning true on success; throws if capacity is exceeded. */
    boolean add(E e);

    /** Inserts the element, returning true on success or false if capacity is exceeded. */
    boolean offer(E e);

    /** Retrieves and removes the head; throws if this pipe is empty. */
    E remove();

    /** Retrieves and removes the head, or returns null if empty. */
    E poll();

    /** Retrieves but does not remove the head; throws if this pipe is empty. */
    E element();

    /** Retrieves but does not remove the head, or returns null if empty. */
    E peek();
}
