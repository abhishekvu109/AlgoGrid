package com.abhishek.algogrid.strategies.bitmagic.BitDifference;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.BitDifferenceInput;

public class BitDifferenceBruteForce implements AGProblemStrategy<BitDifferenceInput, Integer> {
    @Override
    public Integer solve(BitDifferenceInput input) {
        throw new UnsupportedOperationException("TODO: Implement BitDifference - Brute Force");
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
