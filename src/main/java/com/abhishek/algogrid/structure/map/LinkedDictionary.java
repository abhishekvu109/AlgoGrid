package com.abhishek.algogrid.structure.map;

import com.abhishek.algogrid.structure.Dictionary;

import java.util.Collection;
import java.util.Set;

/**
 * A hash-table backed Dictionary that also maintains a doubly-linked list of entries
 * in insertion order. O(1) average get/put/remove; iteration is in insertion order.
 * Equivalent to: java.util.LinkedHashMap
 */
public class LinkedDictionary<K, V> implements Dictionary<K, V> {

    private static final int   DEFAULT_CAPACITY    = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private LinkedEntry<K, V>[] table;
    private LinkedEntry<K, V>   listHead;   // oldest entry
    private LinkedEntry<K, V>   listTail;   // newest entry
    private int size;
    private final float loadFactor;

    // ---- node ---------------------------------------------------------------

    private static class LinkedEntry<K, V> implements Dictionary.Entry<K, V> {
        K key;
        V value;
        int hash;
        LinkedEntry<K, V> next;     // hash-chain successor
        LinkedEntry<K, V> before;   // insertion-order predecessor
        LinkedEntry<K, V> after;    // insertion-order successor

        LinkedEntry(K key, V value, int hash) {
            this.key   = key;
            this.value = value;
            this.hash  = hash;
        }

        @Override public K getKey()          { return key; }
        @Override public V getValue()        { return value; }
        @Override public V setValue(V value) { V old = this.value; this.value = value; return old; }
    }

    // ---- constructors -------------------------------------------------------

    @SuppressWarnings("unchecked")
    public LinkedDictionary() {
        this.table      = new LinkedEntry[DEFAULT_CAPACITY];
        this.loadFactor = DEFAULT_LOAD_FACTOR;
    }

    // ---- internal helpers ---------------------------------------------------

    private int hash(Object key)        { return 0; /* TODO */ }
    private int bucketIndex(int hash)   { return 0; /* TODO */ }
    private void resize()               { /* TODO */ }
    private void linkToTail(LinkedEntry<K, V> entry)   { /* TODO */ }
    private void unlinkFromList(LinkedEntry<K, V> entry) { /* TODO */ }

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
