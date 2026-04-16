package com.abhishek.algogrid.strategies.graph.FindWhetherPathExist;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.FindWhetherPathExistInput;

public class FindWhetherPathExistBFS implements AGProblemStrategy<FindWhetherPathExistInput, Boolean> {
    @Override
    public Boolean solve(FindWhetherPathExistInput input) {
        throw new UnsupportedOperationException("TODO: Implement FindWhetherPathExist - BFS");
    }

    @Override
    public String name() {
        return "BFS";
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
