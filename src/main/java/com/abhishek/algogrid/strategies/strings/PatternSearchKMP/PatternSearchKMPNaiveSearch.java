package com.abhishek.algogrid.strategies.strings.PatternSearchKMP;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.PatternSearchKMPInput;

public class PatternSearchKMPNaiveSearch implements AGProblemStrategy<PatternSearchKMPInput, int[]> {
    @Override
    public int[] solve(PatternSearchKMPInput input) {
        throw new UnsupportedOperationException("TODO: Implement PatternSearchKMP - Naive Pattern Search");
    }

    @Override
    public String name() {
        return "Naive Pattern Search";
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
