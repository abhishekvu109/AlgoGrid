package com.abhishek.algogrid.strategies.dp.CoinChangeMinimumNumberOfCoins;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.CoinChangeMinimumNumberOfCoinsInput;

public class CoinChangeMinimumNumberOfCoinsTabulation implements AGProblemStrategy<CoinChangeMinimumNumberOfCoinsInput, Integer> {
    @Override
    public Integer solve(CoinChangeMinimumNumberOfCoinsInput input) {
        throw new UnsupportedOperationException("TODO: Implement CoinChangeMinimumNumberOfCoins - Bottom-Up Tabulation");
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
