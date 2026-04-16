package com.abhishek.algogrid.strategies.sorting.ThreeWayPartitioning;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.ThreeWayPartitioningInput;

public class ThreeWayPartitioningDutchFlag implements AGProblemStrategy<ThreeWayPartitioningInput, int[]> {
    @Override
    public int[] solve(ThreeWayPartitioningInput input) {
        throw new UnsupportedOperationException("TODO: Implement ThreeWayPartitioning - Dutch National Flag");
    }

    @Override
    public String name() {
        return "Dutch National Flag";
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
