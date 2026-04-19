package com.abhishek.algogrid.structure.graph;

import com.abhishek.algogrid.structure.Container;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Graph backed by an adjacency list: a map from each vertex to its list of neighbors.
 * Space: O(V + E). Edge lookup: O(degree). Add vertex/edge: O(1) amortised.
 * Preferred for sparse graphs.
 * No equivalent in java.util.
 */
public class AdjacencyListGraph<V> implements Graph<V> {

    /** Each vertex maps to a list of its outgoing neighbors. */
    private final Map<V, List<V>> adjacency;
    private final boolean directed;
    private int edgeCount;

    // ---- constructors -------------------------------------------------------

    public AdjacencyListGraph(boolean directed) {
        this.adjacency = new HashMap<>();
        this.directed  = directed;
    }

    /** Convenience factory for an undirected graph. */
    public static <V> AdjacencyListGraph<V> undirected() {
        return new AdjacencyListGraph<>(false);
    }

    /** Convenience factory for a directed graph. */
    public static <V> AdjacencyListGraph<V> directed() {
        return new AdjacencyListGraph<>(true);
    }

    // ---- Graph --------------------------------------------------------------

    @Override
    public void addVertex(V vertex) {
        // TODO: put vertex into adjacency map with an empty list (if absent)
    }

    @Override
    public void addEdge(V from, V to) {
        // TODO: add 'to' to adjacency.get(from)
        //       if undirected, also add 'from' to adjacency.get(to)
    }

    @Override
    public void removeVertex(V vertex) {
        // TODO: remove vertex entry; also remove it from all neighbor lists
    }

    @Override
    public void removeEdge(V from, V to) {
        // TODO: remove 'to' from adjacency.get(from)
        //       if undirected, remove 'from' from adjacency.get(to)
    }

    @Override public boolean hasVertex(V vertex)  { return false; /* TODO */ }
    @Override public boolean hasEdge(V from, V to) { return false; /* TODO */ }

    @Override
    public Container<V> neighbors(V vertex) {
        return null; // TODO: return a Container wrapping adjacency.get(vertex)
    }

    @Override
    public Container<V> vertices() {
        return null; // TODO: return a Container wrapping adjacency.keySet()
    }

    @Override public int vertexCount()  { return adjacency.size(); }
    @Override public int edgeCount()    { return edgeCount; }
    @Override public boolean isDirected() { return directed; }

    @Override public int inDegree(V v)  { return 0; /* TODO */ }
    @Override public int outDegree(V v) { return 0; /* TODO */ }
}
