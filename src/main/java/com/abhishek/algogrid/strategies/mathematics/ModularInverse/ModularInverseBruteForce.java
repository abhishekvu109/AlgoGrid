package com.abhishek.algogrid.strategies.mathematics.ModularInverse;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.ModularInverseInput;

public class ModularInverseBruteForce implements AGProblemStrategy<ModularInverseInput, Integer> {
    @Override
    public Integer solve(ModularInverseInput input) {
        throw new UnsupportedOperationException("TODO: Implement ModularInverse - Brute Force");
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
