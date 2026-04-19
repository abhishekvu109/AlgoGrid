package com.abhishek.algogrid.structure.set;

import com.abhishek.algogrid.structure.*;

import java.util.Comparator;

/**
 * A Red-Black tree backed OrderedBag. O(log n) add/remove/contains.
 * Iteration is always in ascending sorted order.
 * Equivalent to: java.util.TreeSet
 */
public class TreeBag<E> implements OrderedBag<E> {

    private static final boolean RED   = true;
    private static final boolean BLACK = false;

    private Node<E> root;
    private int size;
    private final Comparator<? super E> comparator;

    // ---- node ---------------------------------------------------------------

    private static class Node<E> {
        E element;
        Node<E> left, right, parent;
        boolean color; // RED or BLACK

        Node(E element, Node<E> parent, boolean color) {
            this.element = element;
            this.parent  = parent;
            this.color   = color;
        }
    }

    // ---- constructors -------------------------------------------------------

    public TreeBag() {
        this.comparator = null;
    }

    public TreeBag(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    // ---- internal tree operations -------------------------------------------

    @SuppressWarnings("unchecked")
    private int compare(Object a, Object b) {
        // TODO: use comparator if non-null, else cast to Comparable
        return 0;
    }

    private void rotateLeft(Node<E> node)  { /* TODO */ }
    private void rotateRight(Node<E> node) { /* TODO */ }
    private void fixAfterInsert(Node<E> node) { /* TODO: restore RB invariants */ }
    private void fixAfterDelete(Node<E> node) { /* TODO: restore RB invariants */ }

    private Node<E> minimum(Node<E> node) {
        // TODO: walk left until null
        return null;
    }

    private Node<E> maximum(Node<E> node) {
        // TODO: walk right until null
        return null;
    }

    private Node<E> successor(Node<E> node) {
        // TODO: in-order successor
        return null;
    }

    // ---- Container / Bag / OrderedBag ---------------------------------------

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

    @Override public Comparator<? super E> comparator()        { return comparator; }
    @Override public E first()                                 { return null; }
    @Override public E last()                                  { return null; }
    @Override public OrderedBag<E> headBag(E toElement)        { return null; }
    @Override public OrderedBag<E> tailBag(E fromElement)      { return null; }
    @Override public OrderedBag<E> subBag(E from, E to)        { return null; }

    @Override
    public Traverser<E> traverser() {
        return null; // TODO: in-order traversal via stack or Morris traversal
    }

    // ---- inner traverser skeleton -------------------------------------------

    private class InOrderTraverser implements Traverser<E> {
        private Node<E> next;

        InOrderTraverser() {
            this.next = minimum(root); // start at smallest element
        }

        @Override public boolean hasNext() { return false; }
        @Override public E next()          { return null; }
    }
}
