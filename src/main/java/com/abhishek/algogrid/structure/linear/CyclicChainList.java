package com.abhishek.algogrid.structure.linear;

import com.abhishek.algogrid.structure.*;

/**
 * A singly circular (cyclic) linked list.
 * The tail node's next pointer always points back to the head, forming a ring.
 *
 * Key insight: keeping a pointer to the TAIL (not head) gives O(1) access to
 * both ends — head = tail.next, tail = tail.
 *
 * Use-cases: round-robin scheduling, circular buffers, Josephus problem.
 * No equivalent in java.util.
 */
public class CyclicChainList<E> implements Container<E>, Pipe<E> {

    /**
     * Points to the TAIL node. The head is always reachable via tail.next.
     * null when the list is empty.
     */
    private Node<E> tail;
    private int size;

    // ---- node ---------------------------------------------------------------

    private static class Node<E> {
        E data;
        Node<E> next;   // always non-null when the list is non-empty; tail.next == head

        Node(E data) {
            this.data = data;
            this.next = this; // new isolated node points to itself
        }
    }

    // ---- constructors -------------------------------------------------------

    public CyclicChainList() { }

    // ---- O(1) operations (the advantage of a cyclic list) -------------------

    /**
     * Inserts at the front (new head). O(1).
     * new node → old head; tail.next updated to new node.
     */
    public void addFirst(E e) {
        // TODO: create node; if empty → tail = node (points to itself)
        //       else node.next = tail.next; tail.next = node
    }

    /**
     * Inserts at the back (new tail). O(1).
     * Equivalent to addFirst then advancing the tail pointer.
     */
    public void addLast(E e) {
        // TODO: addFirst(e); tail = tail.next  (the just-inserted node is now head; advance tail to it)
    }

    /**
     * Removes and returns the front element (head). O(1).
     */
    public E removeFirst() {
        // TODO: if empty → throw; if single node → tail = null
        //       else tail.next = head.next; size--; return old head data
        return null;
    }

    /** Returns the front element (head) without removing it. O(1). */
    public E peekFirst() {
        // TODO: return tail == null ? null : tail.next.data
        return null;
    }

    /** Returns the back element (tail) without removing it. O(1). */
    public E peekLast() {
        // TODO: return tail == null ? null : tail.data
        return null;
    }

    // ---- rotation -----------------------------------------------------------

    /**
     * Rotates the list one step clockwise: the current head becomes tail.
     * O(1) — just advance the tail pointer.
     * Core operation for round-robin scheduling.
     */
    public void rotate() {
        // TODO: if size > 1: tail = tail.next  (old head becomes new tail)
    }

    /**
     * Rotates the list k steps clockwise. O(k) but can be O(1) if you
     * compute k mod size first.
     */
    public void rotate(int k) {
        // TODO: for (k mod size) times, call rotate()
    }

    // ---- search/remove (O(n)) -----------------------------------------------

    /**
     * Removes the first occurrence of the given element. O(n).
     * Must traverse the ring exactly once.
     */
    @Override
    public boolean remove(Object o) {
        // TODO: walk from head, keep a 'prev' pointer; stop when data matches or full circle
        //       handle head removal (update tail.next) and tail removal (update tail)
        return false;
    }

    /**
     * Solves the Josephus problem: starting from the head, remove every k-th element.
     * Returns the data of the last surviving element. O(n * k).
     */
    public E josephus(int k) {
        // TODO: repeatedly rotate(k-1) then removeFirst() until one node remains
        return null;
    }

    // ---- Container ----------------------------------------------------------

    @Override public int size()                                { return 0; }
    @Override public boolean isEmpty()                         { return false; }
    @Override public boolean contains(Object o)                { return false; }
    @Override public boolean add(E e)                          { return false; }   // addLast
    @Override public void clear()                              { }
    @Override public Object[] toArray()                        { return new Object[0]; }
    @Override public <T> T[] toArray(T[] a)                   { return null; }
    @Override public boolean containsAll(Container<?> c)       { return false; }
    @Override public boolean addAll(Container<? extends E> c)  { return false; }
    @Override public boolean removeAll(Container<?> c)         { return false; }
    @Override public boolean retainAll(Container<?> c)         { return false; }

    // ---- Pipe (treats front as head of queue) --------------------------------

    @Override public boolean offer(E e)  { return false; }    // addLast
    @Override public E remove()          { return null; }     // removeFirst, throw if empty
    @Override public E poll()            { return null; }     // removeFirst, null if empty
    @Override public E element()         { return null; }     // peekFirst, throw if empty
    @Override public E peek()            { return null; }     // peekFirst, null if empty

    // ---- traversal ----------------------------------------------------------

    /**
     * Returns a Traverser that visits each element exactly once, starting from the head.
     * IMPORTANT: the traverser must stop after 'size' steps — it must NOT loop forever.
     */
    @Override
    public Traverser<E> traverser() {
        return null; // TODO: return inner CyclicTraverser
    }

    // ---- inner traverser skeleton -------------------------------------------

    private class CyclicTraverser implements Traverser<E> {
        private Node<E> current;
        private int remaining;

        CyclicTraverser() {
            this.current   = tail == null ? null : tail.next; // start at head
            this.remaining = size;
        }

        /** Returns true for exactly 'size' calls — prevents infinite looping. */
        @Override public boolean hasNext() { return false; /* remaining > 0 */ }

        @Override
        public E next() {
            // TODO: save current.data; current = current.next; remaining--; return data
            return null;
        }
    }
}
