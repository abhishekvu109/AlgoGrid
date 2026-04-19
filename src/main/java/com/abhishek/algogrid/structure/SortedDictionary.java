package com.abhishek.algogrid.structure;

import java.util.Comparator;

/**
 * A Dictionary that maintains its keys in ascending sorted order.
 * Equivalent to: java.util.SortedMap
 */
public interface SortedDictionary<K, V> extends Dictionary<K, V> {

    /** Returns the comparator used to order keys, or null if natural ordering is used. */
    Comparator<? super K> comparator();

    /** Returns the smallest key in this dictionary. */
    K firstKey();

    /** Returns the largest key in this dictionary. */
    K lastKey();

    /** Returns a view of entries whose keys are strictly less than toKey. */
    SortedDictionary<K, V> headDictionary(K toKey);

    /** Returns a view of entries whose keys are greater than or equal to fromKey. */
    SortedDictionary<K, V> tailDictionary(K fromKey);

    /** Returns a view of entries whose keys are in the range [fromKey, toKey). */
    SortedDictionary<K, V> subDictionary(K fromKey, K toKey);
}
