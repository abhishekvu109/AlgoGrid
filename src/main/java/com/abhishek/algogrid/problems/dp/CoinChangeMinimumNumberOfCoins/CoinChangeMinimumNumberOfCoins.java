package com.abhishek.algogrid.problems.dp.CoinChangeMinimumNumberOfCoins;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.CoinChangeMinimumNumberOfCoinsInput;

public class CoinChangeMinimumNumberOfCoins extends AGProblemTemplate<CoinChangeMinimumNumberOfCoinsInput, Integer> {
    @Override
    protected String problemName() {
        return "Coin Change - Minimum Number of Coins";
    }

    @Override
    protected void validate(CoinChangeMinimumNumberOfCoinsInput input) {
    }

    @Override
    protected CoinChangeMinimumNumberOfCoinsInput copyInput(CoinChangeMinimumNumberOfCoinsInput input) {
        return input;
    }

    @Override
    protected String formatInput(CoinChangeMinimumNumberOfCoinsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.dp.coinChangeMinimumNumberOfCoins";
    }
}
