package com.abhishek.algogrid.strategies.dp.NumberOfUniquePaths;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.NumberOfUniquePathsInput;

public class NumberOfUniquePathsMemoization implements AGProblemStrategy<NumberOfUniquePathsInput, Integer> {
    @Override
    public Integer solve(NumberOfUniquePathsInput input) {
        throw new UnsupportedOperationException("TODO: Implement NumberOfUniquePaths - Top-Down Memoization");
    }

    @Override
    public String name() {
        return "Top-Down Memoization";
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
