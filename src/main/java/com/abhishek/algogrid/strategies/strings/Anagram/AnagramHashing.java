package com.abhishek.algogrid.strategies.strings.Anagram;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.AnagramInput;

public class AnagramHashing implements AGProblemStrategy<AnagramInput, Boolean> {
    @Override
    public Boolean solve(AnagramInput input) {
        throw new UnsupportedOperationException("TODO: Implement Anagram - Using Hashing");
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
