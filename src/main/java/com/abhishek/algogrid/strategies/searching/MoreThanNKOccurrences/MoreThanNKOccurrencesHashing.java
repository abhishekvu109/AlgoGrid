package com.abhishek.algogrid.strategies.searching.MoreThanNKOccurrences;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.MoreThanNKOccurrencesInput;

public class MoreThanNKOccurrencesHashing implements AGProblemStrategy<MoreThanNKOccurrencesInput, int[]> {
    @Override
    public int[] solve(MoreThanNKOccurrencesInput input) {
        throw new UnsupportedOperationException("TODO: Implement MoreThanNKOccurrences - Using Hashing");
    }

    @Override
    public String name() {
        return "Using Hashing";
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
