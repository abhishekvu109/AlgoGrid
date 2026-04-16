package com.abhishek.algogrid.strategies.arrays.RotateArray;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.RotateArrayInput;

public class RotateArrayBruteForce implements AGProblemStrategy<RotateArrayInput, int[]> {
    @Override
    public int[] solve(RotateArrayInput input) {
        throw new UnsupportedOperationException("TODO: Implement RotateArray - Brute Force");
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
