package com.abhishek.algogrid.structure;

/**
 * A Container that contains no duplicate elements.
 * Models the mathematical set abstraction.
 * Equivalent to: java.util.Set
 */
public interface Bag<E> extends Container<E> {
    // All uniqueness-enforcement semantics are implied.
    // add(e) must return false (and not change the bag) if e is already present.
    // Two bags are equal if they contain the same elements regardless of order.
}
