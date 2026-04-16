package com.abhishek.algogrid.strategies.searching.AllocateMinimumPages;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.AllocateMinimumPagesInput;

public class AllocateMinimumPagesBinarySearch implements AGProblemStrategy<AllocateMinimumPagesInput, Integer> {
    @Override
    public Integer solve(AllocateMinimumPagesInput input) {
        throw new UnsupportedOperationException("TODO: Implement AllocateMinimumPages - Binary Search");
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
