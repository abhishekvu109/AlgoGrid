package com.abhishek.algogrid.problems.dp.ZeroOneKnapsackProblem;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.ZeroOneKnapsackProblemInput;

public class ZeroOneKnapsackProblem extends AGProblemTemplate<ZeroOneKnapsackProblemInput, Integer> {
    @Override
    protected String problemName() {
        return "0-1 Knapsack Problem";
    }

    @Override
    protected void validate(ZeroOneKnapsackProblemInput input) {
    }

    @Override
    protected ZeroOneKnapsackProblemInput copyInput(ZeroOneKnapsackProblemInput input) {
        return input;
    }

    @Override
    protected String formatInput(ZeroOneKnapsackProblemInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.dp.zeroOneKnapsackProblem";
    }
}
