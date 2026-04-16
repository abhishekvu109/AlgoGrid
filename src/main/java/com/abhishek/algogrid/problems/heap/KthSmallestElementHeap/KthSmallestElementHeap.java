package com.abhishek.algogrid.problems.heap.KthSmallestElementHeap;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.KthSmallestElementHeapInput;

public class KthSmallestElementHeap extends AGProblemTemplate<KthSmallestElementHeapInput, Integer> {
    @Override
    protected String problemName() {
        return "Kth Smallest Element (Heap)";
    }

    @Override
    protected void validate(KthSmallestElementHeapInput input) {
    }

    @Override
    protected KthSmallestElementHeapInput copyInput(KthSmallestElementHeapInput input) {
        return input;
    }

    @Override
    protected String formatInput(KthSmallestElementHeapInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.heap.kthSmallestElementHeap";
    }
}
