package com.abhishek.algogrid.strategies.strings.PatternSearch;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.PatternSearchInput;

public class PatternSearchKMP implements AGProblemStrategy<PatternSearchInput, int[]> {
    @Override
    public int[] solve(PatternSearchInput input) {
        throw new UnsupportedOperationException("TODO: Implement PatternSearch - KMP Algorithm");
    }

    @Override
    public String name() {
        return "KMP Algorithm";
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
