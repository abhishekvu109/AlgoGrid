package com.abhishek.algogrid.structure.trie;

import com.abhishek.algogrid.structure.Traverser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A Compressed Trie (Patricia Tree / Radix Tree).
 * Merges single-child chains into one edge labelled with a substring.
 * Reduces space from O(alphabet × nodes) to O(words) nodes.
 * O(L) operations. Preferred over standard Trie for large, sparse key sets.
 * No equivalent in java.util.
 */
public class CompressedPrefixTree {

    private final Node root;
    private int wordCount;

    // ---- node ---------------------------------------------------------------

    private static class Node {
        /**
         * Each child edge is keyed by the first character of its label.
         * The full edge label is stored in the child node.
         */
        Map<Character, Node> children;
        String edgeLabel;   // the substring on the edge from parent to this node
        boolean isEnd;

        Node(String edgeLabel) {
            this.edgeLabel = edgeLabel;
            this.children  = new HashMap<>();
            this.isEnd     = false;
        }
    }

    // ---- constructors -------------------------------------------------------

    public CompressedPrefixTree() {
        this.root = new Node("");
    }

    // ---- internal helpers ---------------------------------------------------

    /**
     * Returns the length of the common prefix between two strings.
     * e.g. commonPrefixLength("flower", "flow") = 4.
     */
    private int commonPrefixLength(String a, String b) {
        // TODO
        return 0;
    }

    // ---- core operations ----------------------------------------------------

    /**
     * Inserts a word. May split an existing edge or extend a leaf.
     * O(L) where L = word.length().
     */
    public void insert(String word) {
        // TODO: walk from root matching edge labels character by character;
        //       split edges where the word diverges from existing labels.
    }

    /**
     * Returns true if the exact word exists.
     * O(L).
     */
    public boolean search(String word) {
        // TODO: walk edges; check isEnd at destination node
        return false;
    }

    /**
     * Returns true if any stored word begins with prefix.
     * O(L).
     */
    public boolean startsWith(String prefix) {
        // TODO: walk edges until prefix is exhausted or no matching edge exists
        return false;
    }

    /**
     * Deletes the word if present. Merges single-child non-end nodes.
     * O(L).
     */
    public boolean delete(String word) {
        // TODO: recursive; merge nodes where a merge is possible after deletion
        return false;
    }

    /** Returns all words in lexicographic order. */
    public List<String> getAllWords() {
        return null; // TODO: DFS collecting words at isEnd nodes
    }

    /** Returns all words with the given prefix. */
    public List<String> autocomplete(String prefix) {
        return null; // TODO
    }

    /** Returns a Traverser over all words in lexicographic order. */
    public Traverser<String> traverser() {
        return null; // TODO
    }

    public int wordCount() { return wordCount; }
    public boolean isEmpty() { return wordCount == 0; }
}
