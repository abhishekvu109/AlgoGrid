package com.abhishek.algogrid.structure;

/**
 * A double-ended Pipe that supports insertion and removal at both ends.
 * Can be used as a stack (LIFO) or a queue (FIFO).
 * Equivalent to: java.util.Deque
 */
public interface Deck<E> extends Pipe<E> {

    // ---- front (head) operations ----

    /** Inserts at the front; throws if capacity exceeded. */
    void addFirst(E e);

    /** Inserts at the front; returns false if capacity exceeded. */
    boolean offerFirst(E e);

    /** Removes and returns the front element; throws if empty. */
    E removeFirst();

    /** Removes and returns the front element, or null if empty. */
    E pollFirst();

    /** Returns the front element without removing it; throws if empty. */
    E getFirst();

    /** Returns the front element without removing it, or null if empty. */
    E peekFirst();

    // ---- back (tail) operations ----

    /** Inserts at the back; throws if capacity exceeded. */
    void addLast(E e);

    /** Inserts at the back; returns false if capacity exceeded. */
    boolean offerLast(E e);

    /** Removes and returns the back element; throws if empty. */
    E removeLast();

    /** Removes and returns the back element, or null if empty. */
    E pollLast();

    /** Returns the back element without removing it; throws if empty. */
    E getLast();

    /** Returns the back element without removing it, or null if empty. */
    E peekLast();

    // ---- stack operations (front = top) ----

    /** Pushes an element onto the stack represented by this deck (inserts at front). */
    void push(E e);

    /** Pops an element from the stack represented by this deck (removes from front). */
    E pop();

    // ---- search ----

    /** Removes the first occurrence of the element; returns true if found. */
    boolean removeFirstOccurrence(Object o);

    /** Removes the last occurrence of the element; returns true if found. */
    boolean removeLastOccurrence(Object o);

    /** Returns a Traverser in reverse order (from back to front). */
    Traverser<E> descendingTraverser();
}
