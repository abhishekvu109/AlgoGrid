package com.abhishek.algogrid.strategies.graph.StepsByKnight;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.StepsByKnightInput;

public class StepsByKnightBFS implements AGProblemStrategy<StepsByKnightInput, Integer> {
    @Override
    public Integer solve(StepsByKnightInput input) {
        throw new UnsupportedOperationException("TODO: Implement StepsByKnight - BFS");
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
