package com.abhishek.algogrid.problems.sorting.UnionOf2SortedArrays;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.UnionOf2SortedArraysInput;

public class UnionOf2SortedArrays extends AGProblemTemplate<UnionOf2SortedArraysInput, int[]> {
    @Override
    protected String problemName() {
        return "Union of 2 Sorted Arrays";
    }

    @Override
    protected void validate(UnionOf2SortedArraysInput input) {
    }

    @Override
    protected UnionOf2SortedArraysInput copyInput(UnionOf2SortedArraysInput input) {
        return input;
    }

    @Override
    protected String formatInput(UnionOf2SortedArraysInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.sorting.unionOf2SortedArrays";
    }
}
