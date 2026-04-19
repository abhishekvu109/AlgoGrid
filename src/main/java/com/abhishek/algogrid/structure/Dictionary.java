package com.abhishek.algogrid.structure;

import java.util.Collection;
import java.util.Set;

/**
 * An object that maps unique keys to values. No two entries may share the same key.
 * Equivalent to: java.util.Map
 */
public interface Dictionary<K, V> {

    /** Returns the number of key-value mappings in this dictionary. */
    int size();

    /** Returns true if this dictionary contains no mappings. */
    boolean isEmpty();

    /** Returns true if this dictionary contains a mapping for the specified key. */
    boolean containsKey(Object key);

    /** Returns true if this dictionary maps one or more keys to the specified value. */
    boolean containsValue(Object value);

    /** Returns the value mapped to the specified key, or null if absent. */
    V get(Object key);

    /**
     * Associates the specified value with the specified key.
     * Returns the previous value, or null if there was no prior mapping.
     */
    V put(K key, V value);

    /**
     * Removes the mapping for the specified key.
     * Returns the previous value, or null if there was no mapping.
     */
    V remove(Object key);

    /** Copies all mappings from the given dictionary into this one. */
    void putAll(Dictionary<? extends K, ? extends V> d);

    /** Removes all mappings from this dictionary. */
    void clear();

    /** Returns a Set view of the keys in this dictionary. */
    Set<K> keySet();

    /** Returns a Collection view of the values in this dictionary. */
    Collection<V> values();

    /** Returns a Set view of the key-value entries in this dictionary. */
    Set<Entry<K, V>> entrySet();

    // -------------------------------------------------------------------------

    /**
     * A key-value pair held inside a Dictionary.
     * Equivalent to: java.util.Map.Entry
     */
    interface Entry<K, V> {

        /** Returns the key of this entry. */
        K getKey();

        /** Returns the value of this entry. */
        V getValue();

        /**
         * Replaces the value of this entry with the given value.
         * Returns the old value.
         */
        V setValue(V value);
    }
}
