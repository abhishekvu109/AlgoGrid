package com.abhishek.algogrid.strategies.tree.IdenticalTrees;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.IdenticalTreesInput;

public class IdenticalTreesRecursive implements AGProblemStrategy<IdenticalTreesInput, Boolean> {
    @Override
    public Boolean solve(IdenticalTreesInput input) {
        throw new UnsupportedOperationException("TODO: Implement IdenticalTrees - Recursive");
    }

    @Override
    public String name() {
        return "Recursive";
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
