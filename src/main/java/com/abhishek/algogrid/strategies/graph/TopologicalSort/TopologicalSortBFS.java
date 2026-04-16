package com.abhishek.algogrid.strategies.graph.TopologicalSort;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class TopologicalSortBFS implements AGProblemStrategy<int[], int[]> {
    @Override
    public int[] solve(int[] input) {
        throw new UnsupportedOperationException("TODO: Implement TopologicalSort - BFS - Kahn's");
    }

    @Override
    public String name() {
        return "BFS - Kahn's";
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
