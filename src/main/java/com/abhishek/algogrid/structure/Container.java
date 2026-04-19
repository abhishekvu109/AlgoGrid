package com.abhishek.algogrid.structure;

/**
 * The root interface of the container hierarchy.
 * A Container is a group of objects known as its elements.
 * Equivalent to: java.util.Collection
 */
public interface Container<E> extends Walkable<E> {

    /** Returns the number of elements in this container. */
    int size();

    /** Returns true if this container has no elements. */
    boolean isEmpty();

    /** Returns true if this container holds the specified element. */
    boolean contains(Object o);

    /**
     * Adds the specified element to this container.
     * Returns true if the container changed as a result.
     */
    boolean add(E e);

    /**
     * Removes a single occurrence of the specified element, if present.
     * Returns true if the container changed as a result.
     */
    boolean remove(Object o);

    /** Removes all elements from this container. */
    void clear();

    /** Returns an array containing all elements of this container. */
    Object[] toArray();

    /** Returns an array containing all elements; runtime type is that of the specified array. */
    <T> T[] toArray(T[] a);

    /** Returns true if this container holds every element in the given container. */
    boolean containsAll(Container<?> c);

    /**
     * Adds all elements of the given container to this one.
     * Returns true if this container changed as a result.
     */
    boolean addAll(Container<? extends E> c);

    /**
     * Removes all elements also present in the given container.
     * Returns true if this container changed as a result.
     */
    boolean removeAll(Container<?> c);

    /**
     * Retains only elements that are also in the given container.
     * Returns true if this container changed as a result.
     */
    boolean retainAll(Container<?> c);
}
