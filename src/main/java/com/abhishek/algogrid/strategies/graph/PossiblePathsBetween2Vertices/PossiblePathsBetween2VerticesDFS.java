package com.abhishek.algogrid.strategies.graph.PossiblePathsBetween2Vertices;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.PossiblePathsBetween2VerticesInput;

public class PossiblePathsBetween2VerticesDFS implements AGProblemStrategy<PossiblePathsBetween2VerticesInput, Integer> {
    @Override
    public Integer solve(PossiblePathsBetween2VerticesInput input) {
        throw new UnsupportedOperationException("TODO: Implement PossiblePathsBetween2Vertices - DFS");
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
