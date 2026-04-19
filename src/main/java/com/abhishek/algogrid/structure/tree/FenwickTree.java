package com.abhishek.algogrid.structure.tree;

/**
 * A Fenwick Tree (Binary Indexed Tree, BIT).
 * Space-efficient structure for prefix-sum queries and point updates.
 * O(n) build, O(log n) update and prefix query.
 * Key insight: tree[i] stores the sum of a range whose length is the lowest set bit of i.
 * No equivalent in java.util.
 */
public class FenwickTree {

    /**
     * 1-indexed internal array. tree[i] covers elements from
     * (i - lowBit(i) + 1) to i in the original array.
     */
    private final int[] tree;
    private final int n;

    // ---- constructors -------------------------------------------------------

    public FenwickTree(int n) {
        this.n    = n;
        this.tree = new int[n + 1]; // 1-indexed
    }

    /** Builds a Fenwick Tree from an existing array in O(n). */
    public FenwickTree(int[] arr) {
        this.n    = arr.length;
        this.tree = new int[n + 1];
        for (int i = 0; i < n; i++) {
            update(i + 1, arr[i]); // TODO: can also build in O(n) via parent trick
        }
    }

    // ---- core operation -----------------------------------------------------

    /**
     * Returns the lowest set bit of i.
     * Used to determine the range covered by tree[i] and how to navigate.
     */
    private int lowBit(int i) {
        return i & (-i);
    }

    /**
     * Adds delta to position i (1-indexed).
     * Propagates the change to all ancestors: i → i + lowBit(i) → ...
     * O(log n).
     */
    public void update(int i, int delta) {
        // TODO: walk up the tree using i += lowBit(i)
    }

    /**
     * Returns the prefix sum from position 1 to i (1-indexed, inclusive).
     * Walks down the tree: i → i - lowBit(i) → ...
     * O(log n).
     */
    public int prefixQuery(int i) {
        // TODO
        return 0;
    }

    /**
     * Returns the sum of elements in the range [l, r] (1-indexed, inclusive).
     * O(log n).
     */
    public int rangeQuery(int l, int r) {
        // TODO: prefixQuery(r) - prefixQuery(l - 1)
        return 0;
    }

    /**
     * Sets position i to value (instead of adding a delta).
     * O(log n).
     */
    public void set(int i, int value) {
        // TODO: update(i, value - pointQuery(i))
    }

    /**
     * Returns the value at a single position i (1-indexed).
     * O(log n).
     */
    public int pointQuery(int i) {
        // TODO: rangeQuery(i, i)
        return 0;
    }

    /** Returns the number of elements this tree covers. */
    public int size() { return n; }
}
