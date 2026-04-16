package com.abhishek.algogrid.problems.heap.KthLargestElement;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.KthLargestElementInput;

public class KthLargestElement extends AGProblemTemplate<KthLargestElementInput, Integer> {
    @Override
    protected String problemName() {
        return "Kth Largest Element";
    }

    @Override
    protected void validate(KthLargestElementInput input) {
    }

    @Override
    protected KthLargestElementInput copyInput(KthLargestElementInput input) {
        return input;
    }

    @Override
    protected String formatInput(KthLargestElementInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.heap.kthLargestElement";
    }
}
