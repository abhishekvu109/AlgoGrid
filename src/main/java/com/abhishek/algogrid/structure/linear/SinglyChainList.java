package com.abhishek.algogrid.structure.linear;

import com.abhishek.algogrid.structure.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * A singly linked list — each node holds a data value and a pointer to the next node only.
 * O(1) add/remove at head; O(n) add/remove at tail or by index.
 * Uses less memory per node than ChainList (no prev pointer).
 * No direct equivalent — java.util.LinkedList is always doubly linked.
 */
public class SinglyChainList<E> implements Sequence<E>, Pipe<E> {

    private Node<E> head;
    private int size;

    // ---- node ---------------------------------------------------------------

    @Data
    @AllArgsConstructor
    private static class Node<E> {
        E data;
        Node<E> next;
    }

    // ---- internal helpers ---------------------------------------------------

    /**
     * Returns the node at the given index by walking from head. O(n).
     */
    private Node<E> nodeAt(int index) {
        Node<E> temp = head;
        int i = 0;
        while (temp != null) {
            if (i == index) {
                return temp;
            }
            i++;
            temp = temp.next;
        }
        return null;
    }

    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // ---- head operations (O(1)) ---------------------------------------------

    /**
     * Inserts an element at the front of the list. O(1).
     */
    public void addFirst(E e) {
        head = new Node<>(e, head);
        this.size++;
    }

    /**
     * Removes and returns the front element. O(1).
     */
    public E removeFirst() {
        if (head != null) {
            Node<E> node = head;
            head = head.next;
            this.size--;
            return node.data;
        }
        return null;
    }

    /**
     * Returns the front element without removing it. O(1).
     */
    public E peekFirst() {
        return head == null ? null : head.data;
    }

    // ---- tail operations (O(n)) ---------------------------------------------

    /**
     * Appends an element at the end of the list. O(n) — walk to tail.
     */
    public void addLast(E e) {
        if (head == null) {
            head = new Node<E>(e, null);
            this.size++;
        } else {
            Node<E> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node<E>(e, null));
            this.size++;
        }
    }

    /**
     * Removes and returns the last element. O(n).
     */
    public E removeLast() {
        if (head != null) {
            if (head.getNext() == null) {
                E item = head.getData();
                head = null;
                this.size--;
                return item;
            }
            Node<E> temp = head;
            Node<E> prev = null;
            while (temp.getNext() != null) {
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(null);
            this.size--;
            return temp.getData();

        }
        return null;
    }

    // ---- Container ----------------------------------------------------------

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return head == null || this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (head != null) {
            Node<E> temp = head;
            while (temp != null) {
                E item = (E) o;
                if (item.equals(temp.getData())) {
                    return true;
                }
                temp = temp.getNext();
            }
        }
        return false;
    }

    @Override
    public boolean add(E e) {
        if (head == null) {
            head = new Node<E>(e, null);
            this.size++;
            return true;
        } else {
            Node<E> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node<E>(e, null));
            this.size++;
            return true;
        }
    }

    @Override
    public boolean remove(Object o) {
        return removeFirst() != null;
    }   // removes first occurrence

    @Override
    public void clear() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[this.size];
        Node<E> temp = head;
        for (int i = 0; i < this.size; i++) {
            arr[i] = temp.getData();
            temp = temp.getNext();
        }
        return arr;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        Node<E> temp = head;
        for (int i = 0; i < this.size; i++) {
            T item = (T) temp.getData();
            a[i] = item;
            temp = temp.getNext();
        }
        return a;
    }

    @Override
    public boolean containsAll(Container<?> c) {
        if(c==null|| c.isEmpty()) {
            throw new NullPointerException("Container cannot be null or empty");
        }
        Object[] elements = c.toArray();
        for (Object element : elements) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Container<? extends E> c) {
        if(c==null|| c.isEmpty()) {
            throw new NullPointerException("Container cannot be null or empty");
        }
        Object[] elements = c.toArray();
        for (Object element : elements) {
            this.add((E) element);
        }
        return true;
    }

    @Override
    public boolean removeAll(Container<?> c) {
        if(c==null|| c.isEmpty()) {
            throw new NullPointerException("Container cannot be null or empty");
        }
        Object[] elements = c.toArray();
        for (Object element : elements) {
            this.remove(element);
        }
        return true;
    }

    @Override
    public boolean retainAll(Container<?> c) {
        return false;
    }

    // ---- Sequence -----------------------------------------------------------

    @Override
    public boolean addAll(int index, Container<? extends E> c) {
        return false;
    }

    @Override
    public E get(int index) {
        return nodeAt(index).getData();
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public void add(int index, E element) {
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return -1;
    }  // O(n) full scan

    @Override
    public Sequence<E> subSequence(int from, int to) {
        return null;
    }

    /**
     * BidirectionalTraverser is partially supported: previous() is O(n) since there is no prev pointer.
     */
    @Override
    public BidirectionalTraverser<E> traverser(int index) {
        return null;
    }

    @Override
    public Traverser<E> traverser() {
        return null; // TODO: return inner ForwardTraverser starting at head
    }

    // ---- Pipe ---------------------------------------------------------------

    @Override
    public boolean offer(E e) {
        return false;
    }   // enqueue at tail

    @Override
    public E remove() {
        return null;
    }    // dequeue from head

    @Override
    public E poll() {
        return null;
    }    // dequeue from head (null if empty)

    @Override
    public E element() {
        return null;
    }    // peek head, throw if empty

    @Override
    public E peek() {
        return null;
    }    // peek head, null if empty

    // ---- reversal (key singly-linked-list technique) ------------------------

    /**
     * Reverses the list in-place by relinking nodes. O(n) time, O(1) space.
     * Classic three-pointer technique: prev, curr, next.
     */
    public void reverse() {
        // TODO: walk with prev=null, curr=head; each step: save curr.next, point curr.next=prev, advance
    }

    /**
     * Detects whether the list contains a cycle using Floyd's tortoise-and-hare algorithm.
     * O(n) time, O(1) space.
     */
    public boolean hasCycle() {
        // TODO: slow moves 1 step, fast moves 2 steps; cycle if they meet
        return false;
    }

    // ---- inner traverser skeleton -------------------------------------------

    private class ForwardTraverser implements Traverser<E> {
        private Node<E> current;

        ForwardTraverser() {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return false; /* current != null */
        }

        @Override
        public E next() {
            return null; /* return current.data; current = current.next */
        }
    }
}
