package com.abhishek.algogrid.structure.linear;

import com.abhishek.algogrid.structure.*;

/**
 * A doubly-linked list implementation of both Sequence and Deck.
 * O(1) insert/remove at head or tail; O(n) random access.
 * Equivalent to: java.util.LinkedList
 */
public class ChainList<E> implements Sequence<E>, Deck<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    // ---- node ---------------------------------------------------------------

    private static class Node<E> {
        E data;
        Node<E> prev;
        Node<E> next;

        Node(E data, Node<E> prev, Node<E> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

    }

    // ---- internal helpers ---------------------------------------------------

    /** Returns the Node at the given index (O(n) walk). */
    private Node<E> nodeAt(int index) {
        // TODO: walk from head or tail depending on which is closer
        return null;
    }

    private void rangeCheck(int index) {
        // TODO: throw IndexOutOfBoundsException if index out of [0, size)
    }

    private void linkBefore(E e, Node<E> successor) {
        // TODO: insert a new Node before 'successor'
    }

    private E unlink(Node<E> node) {
        // TODO: remove 'node' from the chain and return its data
        return null;
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

    // ---- Sequence -----------------------------------------------------------

    @Override public boolean addAll(int index, Container<? extends E> c) { return false; }
    @Override public E get(int index)                          { return null; }
    @Override public E set(int index, E element)               { return null; }
    @Override public void add(int index, E element)            { }
    @Override public E remove(int index)                       { return null; }
    @Override public int indexOf(Object o)                     { return -1; }
    @Override public int lastIndexOf(Object o)                 { return -1; }
    @Override public Sequence<E> subSequence(int from, int to) { return null; }

    @Override public BidirectionalTraverser<E> traverser(int index) { return null; }
    @Override public Traverser<E> traverser()                  { return null; }

    // ---- Deck (and Pipe) ----------------------------------------------------

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
    @Override public Traverser<E> descendingTraverser()        { return null; }

    // ---- inner traverser skeleton -------------------------------------------

    private class ChainTraverser implements BidirectionalTraverser<E> {
        private Node<E> next;
        private Node<E> lastReturned;
        private int nextIndex;

        ChainTraverser(int index) {
            // TODO: position at the node corresponding to 'index'
        }

        @Override public boolean hasNext()      { return false; }
        @Override public E next()               { return null; }
        @Override public boolean hasPrevious()  { return false; }
        @Override public E previous()           { return null; }
        @Override public int nextIndex()        { return 0; }
        @Override public int previousIndex()    { return 0; }
        @Override public void set(E e)          { }
        @Override public void add(E e)          { }
    }
}
