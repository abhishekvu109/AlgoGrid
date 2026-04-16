package com.abhishek.algogrid.strategies.searching.SortedArraySearch;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.SortedArraySearchInput;

public class SortedArraySearchBinarySearch implements AGProblemStrategy<SortedArraySearchInput, Integer> {
    @Override
    public Integer solve(SortedArraySearchInput input) {
        throw new UnsupportedOperationException("TODO: Implement SortedArraySearch - Binary Search");
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
