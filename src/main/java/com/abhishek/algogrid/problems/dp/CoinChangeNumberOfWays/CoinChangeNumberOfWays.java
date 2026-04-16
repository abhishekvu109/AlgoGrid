package com.abhishek.algogrid.problems.dp.CoinChangeNumberOfWays;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.CoinChangeNumberOfWaysInput;

public class CoinChangeNumberOfWays extends AGProblemTemplate<CoinChangeNumberOfWaysInput, Integer> {
    @Override
    protected String problemName() {
        return "Coin Change - Number of Ways";
    }

    @Override
    protected void validate(CoinChangeNumberOfWaysInput input) {
    }

    @Override
    protected CoinChangeNumberOfWaysInput copyInput(CoinChangeNumberOfWaysInput input) {
        return input;
    }

    @Override
    protected String formatInput(CoinChangeNumberOfWaysInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.dp.coinChangeNumberOfWays";
    }
}
