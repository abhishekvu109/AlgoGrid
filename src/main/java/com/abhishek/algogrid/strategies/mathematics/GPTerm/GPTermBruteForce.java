package com.abhishek.algogrid.strategies.mathematics.GPTerm;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.GPTermInput;

public class GPTermBruteForce implements AGProblemStrategy<GPTermInput, Long> {
    @Override
    public Long solve(GPTermInput input) {
        throw new UnsupportedOperationException("TODO: Implement GPTerm - Brute Force");
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
