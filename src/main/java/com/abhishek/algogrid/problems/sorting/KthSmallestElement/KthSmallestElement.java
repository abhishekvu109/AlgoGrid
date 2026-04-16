package com.abhishek.algogrid.problems.sorting.KthSmallestElement;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.KthSmallestElementInput;

public class KthSmallestElement extends AGProblemTemplate<KthSmallestElementInput, Integer> {
    @Override
    protected String problemName() {
        return "Kth Smallest Element";
    }

    @Override
    protected void validate(KthSmallestElementInput input) {
    }

    @Override
    protected KthSmallestElementInput copyInput(KthSmallestElementInput input) {
        return input;
    }

    @Override
    protected String formatInput(KthSmallestElementInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.sorting.kthSmallestElement";
    }
}
