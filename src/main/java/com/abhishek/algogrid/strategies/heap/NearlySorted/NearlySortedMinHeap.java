package com.abhishek.algogrid.strategies.heap.NearlySorted;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.NearlySortedInput;

public class NearlySortedMinHeap implements AGProblemStrategy<NearlySortedInput, int[]> {
    @Override
    public int[] solve(NearlySortedInput input) {
        throw new UnsupportedOperationException("TODO: Implement NearlySorted - Using Min Heap");
    }

    @Override
    public String name() {
        return "Using Min Heap";
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
