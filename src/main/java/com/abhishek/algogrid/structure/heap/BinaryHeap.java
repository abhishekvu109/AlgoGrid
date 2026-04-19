package com.abhishek.algogrid.structure.heap;

import com.abhishek.algogrid.structure.Traverser;

import java.util.Comparator;

/**
 * A generic Binary Heap (array-based).
 * Can function as either a min-heap or a max-heap depending on the Comparator.
 * A min-heap is the default (smallest element at the root).
 *
 * Heap property: for every node i, parent(i) ≤ children(i)  [min-heap].
 * Index math (1-indexed): parent(i) = i/2, left(i) = 2*i, right(i) = 2*i+1.
 *
 * No direct equivalent in java.util — java.util.PriorityQueue uses a min-heap internally.
 */
public class BinaryHeap<E> {

    private static final int DEFAULT_CAPACITY = 11;

    /** 1-indexed backing array. heap[0] is unused. */
    private Object[] heap;
    private int size;
    private final Comparator<? super E> comparator;

    // ---- constructors -------------------------------------------------------

    public BinaryHeap() {
        this(DEFAULT_CAPACITY, null);
    }

    /** Pass Comparator.reverseOrder() (or reversed natural order) for a max-heap. */
    public BinaryHeap(Comparator<? super E> comparator) {
        this(DEFAULT_CAPACITY, comparator);
    }

    public BinaryHeap(int initialCapacity, Comparator<? super E> comparator) {
        this.heap       = new Object[initialCapacity + 1];
        this.comparator = comparator;
    }

    /** Builds a heap from an array in O(n) using the Floyd bottom-up method. */
    @SuppressWarnings("unchecked")
    public BinaryHeap(E[] arr, Comparator<? super E> comparator) {
        this.comparator = comparator;
        this.heap       = new Object[arr.length + 1];
        this.size       = arr.length;
        // copy arr into heap[1..n]
        System.arraycopy(arr, 0, heap, 1, arr.length);
        heapify(); // TODO: call siftDown for i from size/2 down to 1
    }

    // ---- index helpers ------------------------------------------------------

    private int parent(int i) { return i / 2; }
    private int left(int i)   { return 2 * i; }
    private int right(int i)  { return 2 * i + 1; }

    @SuppressWarnings("unchecked")
    private int compare(int i, int j) {
        // TODO: compare heap[i] and heap[j] using comparator or Comparable
        return 0;
    }

    private void swap(int i, int j) {
        // TODO: swap heap[i] and heap[j]
    }

    // ---- core heap operations -----------------------------------------------

    /**
     * Restores heap property upward from index i.
     * Called after inserting at the bottom.
     */
    private void siftUp(int i) {
        // TODO: while i > 1 and heap[i] < heap[parent(i)], swap and move up
    }

    /**
     * Restores heap property downward from index i.
     * Called after replacing the root with the last element.
     */
    private void siftDown(int i) {
        // TODO: find smallest child, swap if smaller than current, recurse
    }

    /** Floyd's algorithm — builds heap in O(n) from an existing array. */
    private void heapify() {
        // TODO: for i from size/2 down to 1, call siftDown(i)
    }

    private void grow() {
        // TODO: double backing array
    }

    // ---- public API ---------------------------------------------------------

    /** Inserts an element and restores heap order. O(log n). */
    public void insert(E e) {
        // TODO: place at size+1, siftUp
    }

    /** Returns (without removing) the top element. O(1). */
    @SuppressWarnings("unchecked")
    public E peek() {
        // TODO: return heap[1] if non-empty
        return null;
    }

    /** Removes and returns the top element. O(log n). */
    @SuppressWarnings("unchecked")
    public E extract() {
        // TODO: save heap[1], move heap[size] to heap[1], size--, siftDown(1)
        return null;
    }

    /**
     * Decreases the key at index i to newValue (min-heap use-case).
     * Used in Dijkstra's algorithm.
     * O(log n).
     */
    public void decreaseKey(int i, E newValue) {
        // TODO: update heap[i], siftUp(i)
    }

    /**
     * Deletes the element at index i. O(log n).
     */
    public void deleteAt(int i) {
        // TODO: decreaseKey to -∞, then extract
    }

    public int size()        { return size; }
    public boolean isEmpty() { return size == 0; }

    /** Returns a Traverser over the backing array (not in heap order). */
    public Traverser<E> traverser() {
        return null; // TODO
    }
}
