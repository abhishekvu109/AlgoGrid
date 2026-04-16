package com.abhishek.algogrid.strategies.strings.IsomorphicStrings;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.IsomorphicStringsInput;

public class IsomorphicStringsHashing implements AGProblemStrategy<IsomorphicStringsInput, Boolean> {
    @Override
    public Boolean solve(IsomorphicStringsInput input) {
        throw new UnsupportedOperationException("TODO: Implement IsomorphicStrings - Using Hashing");
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
