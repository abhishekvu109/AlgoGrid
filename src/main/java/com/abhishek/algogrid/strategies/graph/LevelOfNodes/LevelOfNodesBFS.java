package com.abhishek.algogrid.strategies.graph.LevelOfNodes;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.LevelOfNodesInput;

public class LevelOfNodesBFS implements AGProblemStrategy<LevelOfNodesInput, Integer> {
    @Override
    public Integer solve(LevelOfNodesInput input) {
        throw new UnsupportedOperationException("TODO: Implement LevelOfNodes - BFS");
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
