package com.abhishek.algogrid.strategies.greedy.FractionalKnapsack;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.FractionalKnapsackInput;

public class FractionalKnapsackGreedy implements AGProblemStrategy<FractionalKnapsackInput, Double> {
    @Override
    public Double solve(FractionalKnapsackInput input) {
        throw new UnsupportedOperationException("TODO: Implement FractionalKnapsack - Greedy");
    }

    @Override
    public String name() {
        return "Greedy";
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
