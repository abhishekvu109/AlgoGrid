package com.abhishek.algogrid.structure.map;

import com.abhishek.algogrid.structure.Dictionary;

import java.util.Collection;
import java.util.Set;

/**
 * A hash-table backed Dictionary. O(1) average get/put/remove.
 * Key iteration order is undefined and may change on resize.
 * Equivalent to: java.util.HashMap
 */
public class HashDictionary<K, V> implements Dictionary<K, V> {

    private static final int   DEFAULT_CAPACITY    = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private BucketEntry<K, V>[] table;
    private int size;
    private final float loadFactor;

    // ---- node ---------------------------------------------------------------

    static class BucketEntry<K, V> implements Dictionary.Entry<K, V> {
        K key;
        V value;
        int hash;
        BucketEntry<K, V> next;

        BucketEntry(K key, V value, int hash, BucketEntry<K, V> next) {
            this.key   = key;
            this.value = value;
            this.hash  = hash;
            this.next  = next;
        }

        @Override public K getKey()            { return key; }
        @Override public V getValue()          { return value; }
        @Override public V setValue(V value)   { V old = this.value; this.value = value; return old; }
    }

    // ---- constructors -------------------------------------------------------

    @SuppressWarnings("unchecked")
    public HashDictionary() {
        this.table      = new BucketEntry[DEFAULT_CAPACITY];
        this.loadFactor = DEFAULT_LOAD_FACTOR;
    }

    @SuppressWarnings("unchecked")
    public HashDictionary(int initialCapacity, float loadFactor) {
        this.table      = new BucketEntry[initialCapacity];
        this.loadFactor = loadFactor;
    }

    // ---- internal helpers ---------------------------------------------------

    private int hash(Object key) {
        // TODO: spread bits of key.hashCode(); handle null key if desired
        return 0;
    }

    private int bucketIndex(int hash) {
        // TODO: mask to valid table index (e.g. hash & (table.length - 1))
        return 0;
    }

    private void resize() {
        // TODO: double table size, re-bucket every entry
    }

    // ---- Dictionary ---------------------------------------------------------

    @Override public int size()                              { return 0; }
    @Override public boolean isEmpty()                       { return false; }
    @Override public boolean containsKey(Object key)         { return false; }
    @Override public boolean containsValue(Object value)     { return false; }
    @Override public V get(Object key)                       { return null; }
    @Override public V put(K key, V value)                   { return null; }
    @Override public V remove(Object key)                    { return null; }
    @Override public void putAll(Dictionary<? extends K, ? extends V> d) { }
    @Override public void clear()                            { }
    @Override public Set<K> keySet()                         { return null; }
    @Override public Collection<V> values()                  { return null; }
    @Override public Set<Entry<K, V>> entrySet()             { return null; }
}
