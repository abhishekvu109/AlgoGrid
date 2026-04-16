package com.abhishek.algogrid.strategies.heap.KthLargestElement;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.KthLargestElementInput;

public class KthLargestElementMinHeap implements AGProblemStrategy<KthLargestElementInput, Integer> {
    @Override
    public Integer solve(KthLargestElementInput input) {
        throw new UnsupportedOperationException("TODO: Implement KthLargestElement - Using Min Heap");
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
