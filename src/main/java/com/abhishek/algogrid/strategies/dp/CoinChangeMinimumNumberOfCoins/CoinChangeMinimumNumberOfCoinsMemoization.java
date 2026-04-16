package com.abhishek.algogrid.strategies.dp.CoinChangeMinimumNumberOfCoins;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.CoinChangeMinimumNumberOfCoinsInput;

public class CoinChangeMinimumNumberOfCoinsMemoization implements AGProblemStrategy<CoinChangeMinimumNumberOfCoinsInput, Integer> {
    @Override
    public Integer solve(CoinChangeMinimumNumberOfCoinsInput input) {
        throw new UnsupportedOperationException("TODO: Implement CoinChangeMinimumNumberOfCoins - Top-Down Memoization");
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
