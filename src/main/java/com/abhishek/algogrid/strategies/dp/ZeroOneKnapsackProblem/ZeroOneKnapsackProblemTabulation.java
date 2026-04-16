package com.abhishek.algogrid.strategies.dp.ZeroOneKnapsackProblem;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.ZeroOneKnapsackProblemInput;

public class ZeroOneKnapsackProblemTabulation implements AGProblemStrategy<ZeroOneKnapsackProblemInput, Integer> {
    @Override
    public Integer solve(ZeroOneKnapsackProblemInput input) {
        throw new UnsupportedOperationException("TODO: Implement ZeroOneKnapsackProblem - Bottom-Up Tabulation");
    }

    @Override
    public String name() {
        return "Bottom-Up Tabulation";
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
