package com.abhishek.algogrid.strategies.heap.KthLargestElementInAStream;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.KthLargestElementInAStreamInput;

public class KthLargestElementInAStreamMinHeap implements AGProblemStrategy<KthLargestElementInAStreamInput, Integer> {
    @Override
    public Integer solve(KthLargestElementInAStreamInput input) {
        throw new UnsupportedOperationException("TODO: Implement KthLargestElementInAStream - Using Min Heap");
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
