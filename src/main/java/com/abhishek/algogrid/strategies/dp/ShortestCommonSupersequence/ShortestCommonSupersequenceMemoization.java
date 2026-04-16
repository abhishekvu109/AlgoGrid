package com.abhishek.algogrid.strategies.dp.ShortestCommonSupersequence;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.ShortestCommonSupersequenceInput;

public class ShortestCommonSupersequenceMemoization implements AGProblemStrategy<ShortestCommonSupersequenceInput, Integer> {
    @Override
    public Integer solve(ShortestCommonSupersequenceInput input) {
        throw new UnsupportedOperationException("TODO: Implement ShortestCommonSupersequence - Top-Down Memoization");
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
