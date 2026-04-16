package com.abhishek.algogrid.problems.sorting.IntersectionOfTwoSortedArrays;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.IntersectionOfTwoSortedArraysInput;

public class IntersectionOfTwoSortedArrays extends AGProblemTemplate<IntersectionOfTwoSortedArraysInput, int[]> {
    @Override
    protected String problemName() {
        return "Intersection of Two Sorted Arrays";
    }

    @Override
    protected void validate(IntersectionOfTwoSortedArraysInput input) {
    }

    @Override
    protected IntersectionOfTwoSortedArraysInput copyInput(IntersectionOfTwoSortedArraysInput input) {
        return input;
    }

    @Override
    protected String formatInput(IntersectionOfTwoSortedArraysInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.sorting.intersectionOfTwoSortedArrays";
    }
}
