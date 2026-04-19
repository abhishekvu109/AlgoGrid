package com.abhishek.algogrid.structure.graph;

import com.abhishek.algogrid.structure.Container;

/**
 * Core interface for all graph representations.
 * A graph G = (V, E) consists of a set of vertices V and a set of edges E.
 * No equivalent in java.util.
 */
public interface Graph<V> {

    // ---- structure ----------------------------------------------------------

    /** Adds a vertex to the graph. */
    void addVertex(V vertex);

    /**
     * Adds a directed edge from {@code from} to {@code to}.
     * For undirected graphs, also adds the reverse edge.
     */
    void addEdge(V from, V to);

    /** Removes the vertex and all its incident edges. */
    void removeVertex(V vertex);

    /** Removes the edge from {@code from} to {@code to}. */
    void removeEdge(V from, V to);

    // ---- queries ------------------------------------------------------------

    boolean hasVertex(V vertex);
    boolean hasEdge(V from, V to);

    /** Returns all vertices directly reachable from the given vertex. */
    Container<V> neighbors(V vertex);

    /** Returns all vertices in this graph. */
    Container<V> vertices();

    int vertexCount();
    int edgeCount();

    /** Returns true if this is a directed graph (edges have a direction). */
    boolean isDirected();

    // ---- graph properties ---------------------------------------------------

    /** Returns the in-degree of vertex v (number of edges pointing into v). */
    int inDegree(V v);

    /** Returns the out-degree of vertex v (number of edges leaving v). */
    int outDegree(V v);
}
