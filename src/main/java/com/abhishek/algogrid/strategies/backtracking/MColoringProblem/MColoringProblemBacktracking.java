package com.abhishek.algogrid.strategies.backtracking.MColoringProblem;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.MColoringProblemInput;

public class MColoringProblemBacktracking implements AGProblemStrategy<MColoringProblemInput, Boolean> {
    @Override
    public Boolean solve(MColoringProblemInput input) {
        throw new UnsupportedOperationException("TODO: Implement MColoringProblem - Backtracking");
    }

    @Override
    public String name() {
        return "Backtracking";
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
