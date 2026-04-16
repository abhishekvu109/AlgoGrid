package com.abhishek.algogrid.strategies.searching.LeftIndex;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.LeftIndexInput;

public class LeftIndexBinarySearch implements AGProblemStrategy<LeftIndexInput, Integer> {
    @Override
    public Integer solve(LeftIndexInput input) {
        throw new UnsupportedOperationException("TODO: Implement LeftIndex - Binary Search");
    }

    @Override
    public String name() {
        return "Binary Search";
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
