package com.abhishek.algogrid.strategies.searching.MoreThanNKOccurrences;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.MoreThanNKOccurrencesInput;

public class MoreThanNKOccurrencesBruteForce implements AGProblemStrategy<MoreThanNKOccurrencesInput, int[]> {
    @Override
    public int[] solve(MoreThanNKOccurrencesInput input) {
        throw new UnsupportedOperationException("TODO: Implement MoreThanNKOccurrences - Brute Force");
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
