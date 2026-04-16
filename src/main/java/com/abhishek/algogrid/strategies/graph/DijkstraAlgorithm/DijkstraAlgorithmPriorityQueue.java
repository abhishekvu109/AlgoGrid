package com.abhishek.algogrid.strategies.graph.DijkstraAlgorithm;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class DijkstraAlgorithmPriorityQueue implements AGProblemStrategy<int[], int[]> {
    @Override
    public int[] solve(int[] input) {
        throw new UnsupportedOperationException("TODO: Implement DijkstraAlgorithm - Using Priority Queue");
    }

    @Override
    public String name() {
        return "Using Priority Queue";
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
