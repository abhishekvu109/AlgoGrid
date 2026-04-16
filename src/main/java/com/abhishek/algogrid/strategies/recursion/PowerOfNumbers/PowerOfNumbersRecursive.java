package com.abhishek.algogrid.strategies.recursion.PowerOfNumbers;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.PowerOfNumbersInput;

public class PowerOfNumbersRecursive implements AGProblemStrategy<PowerOfNumbersInput, Double> {
    @Override
    public Double solve(PowerOfNumbersInput input) {
        throw new UnsupportedOperationException("TODO: Implement PowerOfNumbers - Recursive");
    }

    @Override
    public String name() {
        return "Recursive";
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
