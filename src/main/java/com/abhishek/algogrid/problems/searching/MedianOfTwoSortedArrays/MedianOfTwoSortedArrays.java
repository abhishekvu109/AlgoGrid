package com.abhishek.algogrid.problems.searching.MedianOfTwoSortedArrays;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.MedianOfTwoSortedArraysInput;

public class MedianOfTwoSortedArrays extends AGProblemTemplate<MedianOfTwoSortedArraysInput, Double> {
    @Override
    protected String problemName() {
        return "Median of Two Sorted Arrays";
    }

    @Override
    protected void validate(MedianOfTwoSortedArraysInput input) {
    }

    @Override
    protected MedianOfTwoSortedArraysInput copyInput(MedianOfTwoSortedArraysInput input) {
        return input;
    }

    @Override
    protected String formatInput(MedianOfTwoSortedArraysInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Double output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.searching.medianOfTwoSortedArrays";
    }
}
