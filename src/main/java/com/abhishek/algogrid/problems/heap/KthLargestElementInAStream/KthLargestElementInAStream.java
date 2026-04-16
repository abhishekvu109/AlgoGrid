package com.abhishek.algogrid.problems.heap.KthLargestElementInAStream;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.KthLargestElementInAStreamInput;

public class KthLargestElementInAStream extends AGProblemTemplate<KthLargestElementInAStreamInput, Integer> {
    @Override
    protected String problemName() {
        return "Kth Largest Element in a Stream";
    }

    @Override
    protected void validate(KthLargestElementInAStreamInput input) {
    }

    @Override
    protected KthLargestElementInAStreamInput copyInput(KthLargestElementInAStreamInput input) {
        return input;
    }

    @Override
    protected String formatInput(KthLargestElementInAStreamInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.heap.kthLargestElementInAStream";
    }
}
