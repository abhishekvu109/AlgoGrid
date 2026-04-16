package com.abhishek.algogrid.strategies.tree.CountNodesAtDistanceKFromLeaf;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.CountNodesAtDistanceKFromLeafInput;

public class CountNodesAtDistanceKFromLeafDFS implements AGProblemStrategy<CountNodesAtDistanceKFromLeafInput, Integer> {
    @Override
    public Integer solve(CountNodesAtDistanceKFromLeafInput input) {
        throw new UnsupportedOperationException("TODO: Implement CountNodesAtDistanceKFromLeaf - DFS");
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
