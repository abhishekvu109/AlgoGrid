package com.abhishek.algogrid.structure.trie;

import com.abhishek.algogrid.structure.Traverser;

import java.util.List;

/**
 * A Trie (Prefix Tree) for efficient string operations.
 * O(L) insert/search/delete where L is the length of the string.
 * Excellent for autocomplete, spell-check, and prefix matching.
 * No equivalent in java.util.
 */
public class PrefixTree {

    /** Size of the character set (26 for lowercase English letters). */
    private static final int ALPHABET_SIZE = 26;

    private final TrieNode root;
    private int wordCount;

    // ---- node ---------------------------------------------------------------

    private static class TrieNode {
        TrieNode[] children;
        boolean isEnd;      // marks this node as the end of a valid word
        int passCount;      // how many words pass through this node (for deletion)

        TrieNode() {
            this.children  = new TrieNode[ALPHABET_SIZE];
            this.isEnd     = false;
            this.passCount = 0;
        }
    }

    // ---- constructors -------------------------------------------------------

    public PrefixTree() {
        this.root = new TrieNode();
    }

    // ---- internal helpers ---------------------------------------------------

    /** Converts a character to its array index (assumes lowercase a-z). */
    private int charIndex(char c) {
        return c - 'a';
    }

    // ---- core operations ----------------------------------------------------

    /**
     * Inserts the given word into the trie.
     * O(L) where L = word.length().
     */
    public void insert(String word) {
        // TODO: walk/create nodes for each character; mark last node isEnd = true
    }

    /**
     * Returns true if the exact word exists in the trie.
     * O(L).
     */
    public boolean search(String word) {
        // TODO: walk nodes; return node != null && node.isEnd
        return false;
    }

    /**
     * Returns true if any word in the trie starts with the given prefix.
     * O(L).
     */
    public boolean startsWith(String prefix) {
        // TODO: walk nodes; return node != null
        return false;
    }

    /**
     * Deletes the word from the trie if it exists.
     * O(L). Prune leaf nodes that are no longer needed.
     */
    public boolean delete(String word) {
        // TODO: recursive delete; remove nodes with passCount == 0 and !isEnd
        return false;
    }

    /**
     * Returns all words in the trie that begin with the given prefix.
     * O(P + W) where P = prefix length, W = total characters in matched words.
     */
    public List<String> autocomplete(String prefix) {
        // TODO: find prefix node, then DFS to collect all words below it
        return null;
    }

    /**
     * Returns all words stored in the trie in lexicographic order.
     * O(total characters).
     */
    public List<String> getAllWords() {
        // TODO: DFS from root, collecting words at isEnd nodes
        return null;
    }

    /** Returns a Traverser over all words in lexicographic order. */
    public Traverser<String> traverser() {
        return null; // TODO: wrap getAllWords() or implement iteratively
    }

    public int wordCount() { return wordCount; }
    public boolean isEmpty() { return wordCount == 0; }
}
