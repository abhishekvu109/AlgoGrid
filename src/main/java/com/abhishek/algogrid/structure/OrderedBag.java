package com.abhishek.algogrid.structure;

import java.util.Comparator;

/**
 * A Bag that keeps its elements in ascending sorted order.
 * Equivalent to: java.util.SortedSet
 */
public interface OrderedBag<E> extends Bag<E> {

    /** Returns the comparator used to order elements, or null if natural ordering is used. */
    Comparator<? super E> comparator();

    /** Returns the smallest element in this bag. */
    E first();

    /** Returns the largest element in this bag. */
    E last();

    /** Returns a view of elements strictly less than toElement. */
    OrderedBag<E> headBag(E toElement);

    /** Returns a view of elements greater than or equal to fromElement. */
    OrderedBag<E> tailBag(E fromElement);

    /** Returns a view of elements in the range [fromElement, toElement). */
    OrderedBag<E> subBag(E fromElement, E toElement);
}
