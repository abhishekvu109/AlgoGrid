package com.abhishek.algogrid.strategies.graph.UndirectedGraphCycle;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class UndirectedGraphCycleDFS implements AGProblemStrategy<int[], Boolean> {
    @Override
    public Boolean solve(int[] input) {
        throw new UnsupportedOperationException("TODO: Implement UndirectedGraphCycle - DFS");
    }

    @Override
    public String name() {
        return "DFS";
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
