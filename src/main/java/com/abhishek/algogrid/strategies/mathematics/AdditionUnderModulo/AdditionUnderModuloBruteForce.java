package com.abhishek.algogrid.strategies.mathematics.AdditionUnderModulo;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.AdditionUnderModuloInput;

public class AdditionUnderModuloBruteForce implements AGProblemStrategy<AdditionUnderModuloInput, Long> {
    @Override
    public Long solve(AdditionUnderModuloInput input) {
        throw new UnsupportedOperationException("TODO: Implement AdditionUnderModulo - Brute Force");
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
