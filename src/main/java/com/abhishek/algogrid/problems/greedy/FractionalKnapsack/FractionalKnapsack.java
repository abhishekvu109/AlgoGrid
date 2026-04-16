package com.abhishek.algogrid.problems.greedy.FractionalKnapsack;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.FractionalKnapsackInput;

public class FractionalKnapsack extends AGProblemTemplate<FractionalKnapsackInput, Double> {
    @Override
    protected String problemName() {
        return "Fractional Knapsack";
    }

    @Override
    protected void validate(FractionalKnapsackInput input) {
    }

    @Override
    protected FractionalKnapsackInput copyInput(FractionalKnapsackInput input) {
        return input;
    }

    @Override
    protected String formatInput(FractionalKnapsackInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Double output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.greedy.fractionalKnapsack";
    }
}
