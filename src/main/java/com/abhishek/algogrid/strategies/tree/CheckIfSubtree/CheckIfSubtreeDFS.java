package com.abhishek.algogrid.strategies.tree.CheckIfSubtree;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.CheckIfSubtreeInput;

public class CheckIfSubtreeDFS implements AGProblemStrategy<CheckIfSubtreeInput, Boolean> {
    @Override
    public Boolean solve(CheckIfSubtreeInput input) {
        throw new UnsupportedOperationException("TODO: Implement CheckIfSubtree - DFS");
    }

    @Override
    public String name() {
        return "DFS";
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
