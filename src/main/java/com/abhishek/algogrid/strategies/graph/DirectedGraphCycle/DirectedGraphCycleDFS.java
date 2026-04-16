package com.abhishek.algogrid.strategies.graph.DirectedGraphCycle;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class DirectedGraphCycleDFS implements AGProblemStrategy<int[], Boolean> {
    @Override
    public Boolean solve(int[] input) {
        throw new UnsupportedOperationException("TODO: Implement DirectedGraphCycle - DFS with Color");
    }

    @Override
    public String name() {
        return "DFS with Color";
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
