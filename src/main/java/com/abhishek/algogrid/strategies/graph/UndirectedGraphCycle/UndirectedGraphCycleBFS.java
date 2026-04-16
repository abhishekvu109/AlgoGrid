package com.abhishek.algogrid.strategies.graph.UndirectedGraphCycle;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class UndirectedGraphCycleBFS implements AGProblemStrategy<int[], Boolean> {
    @Override
    public Boolean solve(int[] input) {
        throw new UnsupportedOperationException("TODO: Implement UndirectedGraphCycle - BFS");
    }

    @Override
    public String name() {
        return "BFS";
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
