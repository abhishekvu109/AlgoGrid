package com.abhishek.algogrid.strategies.strings.FirstOccurence;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.FirstOccurenceInput;

public class FirstOccurenceKMP implements AGProblemStrategy<FirstOccurenceInput, Integer> {
    @Override
    public Integer solve(FirstOccurenceInput input) {
        throw new UnsupportedOperationException("TODO: Implement FirstOccurence - KMP Algorithm");
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
