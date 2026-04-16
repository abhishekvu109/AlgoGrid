package com.abhishek.algogrid.strategies.sorting.SortByAbsoluteDifference;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.SortByAbsoluteDifferenceInput;

public class SortByAbsoluteDifferenceBruteForce implements AGProblemStrategy<SortByAbsoluteDifferenceInput, int[]> {
    @Override
    public int[] solve(SortByAbsoluteDifferenceInput input) {
        throw new UnsupportedOperationException("TODO: Implement SortByAbsoluteDifference - Brute Force");
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
