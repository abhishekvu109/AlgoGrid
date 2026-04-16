package com.abhishek.algogrid.strategies.mathematics.MultiplicationUnderModulo;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.MultiplicationUnderModuloInput;

public class MultiplicationUnderModuloBruteForce implements AGProblemStrategy<MultiplicationUnderModuloInput, Long> {
    @Override
    public Long solve(MultiplicationUnderModuloInput input) {
        throw new UnsupportedOperationException("TODO: Implement MultiplicationUnderModulo - Brute Force");
    }

    @Override
    public String name() {
        return "Brute Force";
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
