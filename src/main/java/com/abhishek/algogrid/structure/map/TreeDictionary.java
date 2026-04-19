package com.abhishek.algogrid.structure.map;

import com.abhishek.algogrid.structure.SortedDictionary;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;

/**
 * A Red-Black tree backed SortedDictionary. O(log n) get/put/remove.
 * Keys are always returned in ascending sorted order.
 * Equivalent to: java.util.TreeMap
 */
public class TreeDictionary<K, V> implements SortedDictionary<K, V> {

    private static final boolean RED   = true;
    private static final boolean BLACK = false;

    private Node<K, V> root;
    private int size;
    private final Comparator<? super K> comparator;

    // ---- node ---------------------------------------------------------------

    private static class Node<K, V> implements SortedDictionary.Entry<K, V> {
        K key;
        V value;
        Node<K, V> left, right, parent;
        boolean color;

        Node(K key, V value, Node<K, V> parent) {
            this.key    = key;
            this.value  = value;
            this.parent = parent;
            this.color  = RED;
        }

        @Override public K getKey()          { return key; }
        @Override public V getValue()        { return value; }
        @Override public V setValue(V value) { V old = this.value; this.value = value; return old; }
    }

    // ---- constructors -------------------------------------------------------

    public TreeDictionary() {
        this.comparator = null;
    }

    public TreeDictionary(Comparator<? super K> comparator) {
        this.comparator = comparator;
    }

    // ---- internal tree operations -------------------------------------------

    @SuppressWarnings("unchecked")
    private int compare(Object a, Object b) {
        // TODO: use comparator if non-null, else cast to Comparable
        return 0;
    }

    private Node<K, V> findNode(Object key) {
        // TODO: BST search using compare()
        return null;
    }

    private void rotateLeft(Node<K, V> node)  { /* TODO */ }
    private void rotateRight(Node<K, V> node) { /* TODO */ }
    private void fixAfterInsert(Node<K, V> node) { /* TODO: RB fix-up */ }
    private void fixAfterDelete(Node<K, V> node) { /* TODO: RB fix-up */ }
    private Node<K, V> minimum(Node<K, V> node) { return null; /* TODO */ }
    private Node<K, V> maximum(Node<K, V> node) { return null; /* TODO */ }
    private Node<K, V> successor(Node<K, V> node) { return null; /* TODO */ }

    // ---- SortedDictionary ---------------------------------------------------

    @Override public Comparator<? super K> comparator()              { return comparator; }
    @Override public K firstKey()                                    { return null; }
    @Override public K lastKey()                                     { return null; }
    @Override public SortedDictionary<K, V> headDictionary(K toKey) { return null; }
    @Override public SortedDictionary<K, V> tailDictionary(K from)  { return null; }
    @Override public SortedDictionary<K, V> subDictionary(K f, K t) { return null; }

    // ---- Dictionary ---------------------------------------------------------

    @Override public int size()                              { return 0; }
    @Override public boolean isEmpty()                       { return false; }
    @Override public boolean containsKey(Object key)         { return false; }
    @Override public boolean containsValue(Object value)     { return false; }
    @Override public V get(Object key)                       { return null; }
    @Override public V put(K key, V value)                   { return null; }
    @Override public V remove(Object key)                    { return null; }
    @Override public void putAll(SortedDictionary<? extends K, ? extends V> d) { }
    @Override public void clear()                            { }
    @Override public Set<K> keySet()                         { return null; }
    @Override public Collection<V> values()                  { return null; }
    @Override public Set<Entry<K, V>> entrySet()             { return null; }
}
