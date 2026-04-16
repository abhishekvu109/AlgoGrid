package com.abhishek.algogrid.strategies.dp.OptimalStrategyForAGame;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class OptimalStrategyForAGameMemoization implements AGProblemStrategy<int[], Integer> {
    @Override
    public Integer solve(int[] input) {
        throw new UnsupportedOperationException("TODO: Implement OptimalStrategyForAGame - Top-Down Memoization");
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
