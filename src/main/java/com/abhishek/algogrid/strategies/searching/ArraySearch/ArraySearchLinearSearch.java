package com.abhishek.algogrid.strategies.searching.ArraySearch;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.ArraySearchInput;

public class ArraySearchLinearSearch implements AGProblemStrategy<ArraySearchInput, Integer> {
    @Override
    public Integer solve(ArraySearchInput input) {
        throw new UnsupportedOperationException("TODO: Implement ArraySearch - Linear Search");
    }

    @Override
    public String name() {
        return "Linear Search";
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
