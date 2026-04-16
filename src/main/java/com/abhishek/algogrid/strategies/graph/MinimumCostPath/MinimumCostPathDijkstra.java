package com.abhishek.algogrid.strategies.graph.MinimumCostPath;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class MinimumCostPathDijkstra implements AGProblemStrategy<int[], Integer> {
    @Override
    public Integer solve(int[] input) {
        throw new UnsupportedOperationException("TODO: Implement MinimumCostPath - Dijkstra's Algorithm");
    }

    @Override
    public String name() {
        return "Dijkstra's Algorithm";
    }

    @Override
    public String timeComplexity() {
        return "O(?)";
    }

    @Override
    public String spaceComplexity() {
        return "O(?)";
    }
}
