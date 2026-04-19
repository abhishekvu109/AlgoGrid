package com.abhishek.algogrid.structure.graph;

import com.abhishek.algogrid.structure.Container;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * A weighted directed/undirected graph backed by an adjacency list.
 * Each edge carries a numeric weight, enabling shortest-path algorithms
 * (Dijkstra, Bellman-Ford, Floyd-Warshall).
 * No equivalent in java.util.
 */
public class WeightedGraph<V> {

    /** Each vertex maps to a list of weighted edges leaving it. */
    private final Map<V, List<Edge<V>>> adjacency;
    private final boolean directed;
    private int edgeCount;

    // ---- edge ---------------------------------------------------------------

    public static class Edge<V> {
        public final V from;
        public final V to;
        public final double weight;

        public Edge(V from, V to, double weight) {
            this.from   = from;
            this.to     = to;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return from + " --(" + weight + ")--> " + to;
        }
    }

    // ---- constructors -------------------------------------------------------

    public WeightedGraph(boolean directed) {
        this.adjacency = new HashMap<>();
        this.directed  = directed;
    }

    // ---- structure ----------------------------------------------------------

    public void addVertex(V vertex) {
        // TODO: adjacency.putIfAbsent(vertex, new LinkedList<>())
    }

    public void addEdge(V from, V to, double weight) {
        // TODO: add Edge(from, to, weight) to adjacency.get(from)
        //       if undirected, add Edge(to, from, weight) to adjacency.get(to)
    }

    public void removeEdge(V from, V to) {
        // TODO: remove the edge(s) from the adjacency list
    }

    public void removeVertex(V vertex) {
        // TODO: remove vertex; remove all edges referencing it
    }

    // ---- queries ------------------------------------------------------------

    public boolean hasVertex(V vertex)        { return false; /* TODO */ }
    public boolean hasEdge(V from, V to)      { return false; /* TODO */ }
    public double getWeight(V from, V to)     { return Double.MAX_VALUE; /* TODO */ }
    public List<Edge<V>> edgesFrom(V vertex)  { return null; /* TODO */ }
    public int vertexCount()                  { return adjacency.size(); }
    public int edgeCount()                    { return edgeCount; }
    public boolean isDirected()               { return directed; }

    // ---- algorithms (stubs for you to implement) ----------------------------

    /**
     * Dijkstra's shortest-path from source to all reachable vertices.
     * Returns a map of vertex → shortest distance from source.
     * Precondition: all edge weights ≥ 0.
     */
    public Map<V, Double> dijkstra(V source) {
        // TODO: use a min-heap (PriorityPipe or java.util.PriorityQueue)
        return null;
    }

    /**
     * Bellman-Ford shortest-path from source.
     * Handles negative weights; detects negative cycles.
     * Returns null if a negative cycle is reachable from source.
     */
    public Map<V, Double> bellmanFord(V source) {
        // TODO: relax all edges (V-1) times; check for further relaxation
        return null;
    }
}
