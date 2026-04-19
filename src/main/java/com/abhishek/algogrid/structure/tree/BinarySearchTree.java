package com.abhishek.algogrid.structure.tree;

import com.abhishek.algogrid.structure.Traverser;

import java.util.Comparator;

/**
 * A classic Binary Search Tree (BST).
 * Left subtree keys < root key < right subtree keys.
 * O(log n) average case; O(n) worst case (degenerate tree).
 * No equivalent in java.util — use java.util.TreeMap for a balanced alternative.
 */
public class BinarySearchTree<E> {

    private Node<E> root;
    private int size;
    private final Comparator<? super E> comparator;

    // ---- node ---------------------------------------------------------------

    protected static class Node<E> {
        E data;
        Node<E> left;
        Node<E> right;
        Node<E> parent;

        Node(E data, Node<E> parent) {
            this.data   = data;
            this.parent = parent;
        }
    }

    // ---- constructors -------------------------------------------------------

    public BinarySearchTree() {
        this.comparator = null;
    }

    public BinarySearchTree(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    // ---- internal helpers ---------------------------------------------------

    @SuppressWarnings("unchecked")
    protected int compare(Object a, Object b) {
        // TODO: use comparator if non-null, else cast to Comparable
        return 0;
    }

    // ---- core operations ----------------------------------------------------

    /** Inserts the element, maintaining BST property. */
    public void insert(E e) {
        // TODO
    }

    /** Returns true if the element exists in the tree. */
    public boolean search(E e) {
        // TODO
        return false;
    }

    /** Removes the element from the tree; handles 0, 1, and 2 child cases. */
    public boolean delete(E e) {
        // TODO: three cases — leaf, one child, two children (replace with in-order successor)
        return false;
    }

    /** Returns the smallest element in the tree. */
    public E min() {
        // TODO: walk left until null
        return null;
    }

    /** Returns the largest element in the tree. */
    public E max() {
        // TODO: walk right until null
        return null;
    }

    /** Returns the height of the tree (longest root-to-leaf path). */
    public int height() {
        // TODO: recursive max(left height, right height) + 1
        return 0;
    }

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }

    // ---- traversals ---------------------------------------------------------

    /** Returns a Traverser that visits nodes in ascending (in-order) sequence. */
    public Traverser<E> inOrder() {
        return null; // TODO: iterative using explicit stack or Morris traversal
    }

    /** Returns a Traverser that visits root before children. */
    public Traverser<E> preOrder() {
        return null; // TODO
    }

    /** Returns a Traverser that visits root after children. */
    public Traverser<E> postOrder() {
        return null; // TODO
    }

    /** Returns a Traverser that visits nodes level by level (BFS). */
    public Traverser<E> levelOrder() {
        return null; // TODO: use a queue internally
    }

    // ---- inner helper -------------------------------------------------------

    protected Node<E> minimum(Node<E> node) {
        // TODO: walk left
        return null;
    }
}
