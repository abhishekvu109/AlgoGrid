package com.abhishek.algogrid.strategies.heap.KMostOccurringElements;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.KMostOccurringElementsInput;

public class KMostOccurringElementsMaxHeap implements AGProblemStrategy<KMostOccurringElementsInput, int[]> {
    @Override
    public int[] solve(KMostOccurringElementsInput input) {
        throw new UnsupportedOperationException("TODO: Implement KMostOccurringElements - Using Max Heap");
    }

    @Override
    public String name() {
        return "Using Max Heap";
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
