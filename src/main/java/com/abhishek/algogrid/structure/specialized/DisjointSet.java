package com.abhishek.algogrid.structure.specialized;

/**
 * Disjoint Set Union (Union-Find) with path compression and union by rank.
 * Supports near-O(1) amortised find and union (inverse Ackermann α(n)).
 * Used in Kruskal's MST, cycle detection, connected components.
 * No equivalent in java.util.
 */
public class DisjointSet {

    /**
     * parent[i] = the representative of element i's set.
     * If parent[i] == i, then i is the root (representative) of its set.
     */
    private final int[] parent;

    /**
     * rank[i] = upper bound on the height of the tree rooted at i.
     * Used during union to keep trees shallow.
     */
    private final int[] rank;

    private int components; // number of disjoint sets

    // ---- constructors -------------------------------------------------------

    /**
     * Creates n disjoint sets {0}, {1}, …, {n-1}.
     * Each element is its own representative.
     */
    public DisjointSet(int n) {
        parent     = new int[n];
        rank       = new int[n];
        components = n;
        for (int i = 0; i < n; i++) {
            parent[i] = i;  // each element is its own parent
            rank[i]   = 0;
        }
    }

    // ---- core operations ----------------------------------------------------

    /**
     * Finds the representative (root) of the set containing x.
     * Applies path compression: points every visited node directly to the root.
     * O(α(n)) amortised.
     */
    public int find(int x) {
        // TODO: if parent[x] != x, recursively find root and compress path
        return 0;
    }

    /**
     * Merges the sets containing x and y.
     * Uses union by rank: attach the shorter tree under the taller one.
     * O(α(n)) amortised.
     *
     * @return true if x and y were in different sets (a merge occurred)
     */
    public boolean union(int x, int y) {
        // TODO: find roots; if same root, already connected; else attach by rank
        return false;
    }

    /**
     * Returns true if x and y belong to the same set.
     * O(α(n)).
     */
    public boolean connected(int x, int y) {
        // TODO: find(x) == find(y)
        return false;
    }

    /** Returns the number of disjoint sets. */
    public int componentCount() { return components; }

    /** Returns the total number of elements across all sets. */
    public int size() { return parent.length; }
}
