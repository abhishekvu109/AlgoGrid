package com.abhishek.algogrid.strategies.dp.EqualSumPartition;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class EqualSumPartitionMemoization implements AGProblemStrategy<int[], Boolean> {
    @Override
    public Boolean solve(int[] input) {
        throw new UnsupportedOperationException("TODO: Implement EqualSumPartition - Top-Down Memoization");
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
