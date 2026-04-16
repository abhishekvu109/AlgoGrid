package com.abhishek.algogrid.strategies.dp.CoinChangeNumberOfWays;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.CoinChangeNumberOfWaysInput;

public class CoinChangeNumberOfWaysTabulation implements AGProblemStrategy<CoinChangeNumberOfWaysInput, Integer> {
    @Override
    public Integer solve(CoinChangeNumberOfWaysInput input) {
        throw new UnsupportedOperationException("TODO: Implement CoinChangeNumberOfWays - Bottom-Up Tabulation");
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
