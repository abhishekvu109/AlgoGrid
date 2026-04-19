package com.abhishek.algogrid.structure.tree;

/**
 * A Segment Tree built over an array for efficient range queries and point/range updates.
 * O(n) build, O(log n) query and update.
 * Common use-cases: range sum, range min/max, range GCD.
 * No equivalent in java.util.
 */
public class SegmentTree {

    /**
     * Internal tree array stored in a 1-indexed flat array.
     * For node at index i: left child = 2*i, right child = 2*i+1.
     * Size must be at least 4 * n to be safe.
     */
    private final int[] tree;
    private final int n;        // number of elements in the original array

    // ---- constructors -------------------------------------------------------

    public SegmentTree(int[] arr) {
        this.n    = arr.length;
        this.tree = new int[4 * n];
        build(arr, 1, 0, n - 1);
    }

    // ---- build --------------------------------------------------------------

    /**
     * Recursively builds the segment tree.
     *
     * @param arr   the source array
     * @param node  current node index in {@code tree[]}
     * @param start left bound of this segment (inclusive, array index)
     * @param end   right bound of this segment (inclusive, array index)
     */
    private void build(int[] arr, int node, int start, int end) {
        // TODO: leaf → tree[node] = arr[start]
        //       internal → build left/right, then tree[node] = merge(left, right)
    }

    /**
     * Combines two child values into a parent value.
     * Change this to switch between sum / min / max / gcd.
     */
    private int merge(int left, int right) {
        return left + right; // default: range sum
    }

    // ---- point update -------------------------------------------------------

    /**
     * Sets arr[index] = value and propagates the change up the tree.
     * O(log n).
     */
    public void update(int index, int value) {
        update(1, 0, n - 1, index, value); // TODO
    }

    private void update(int node, int start, int end, int index, int value) {
        // TODO
    }

    // ---- range update (lazy propagation) ------------------------------------

    /**
     * Adds delta to every element in arr[l..r] using lazy propagation.
     * Requires a separate lazy[] array (add it as a field).
     * O(log n).
     */
    public void rangeUpdate(int l, int r, int delta) {
        // TODO: implement lazy propagation
    }

    // ---- range query --------------------------------------------------------

    /**
     * Returns the aggregated value (e.g. sum) over arr[l..r].
     * O(log n).
     */
    public int query(int l, int r) {
        return query(1, 0, n - 1, l, r); // TODO
    }

    private int query(int node, int start, int end, int l, int r) {
        // TODO: three cases — fully outside, fully inside, partial overlap
        return 0;
    }

    // ---- utilities ----------------------------------------------------------

    /** Returns the number of elements this tree was built over. */
    public int size() { return n; }
}
