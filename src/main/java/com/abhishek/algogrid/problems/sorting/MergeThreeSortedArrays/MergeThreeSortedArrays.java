package com.abhishek.algogrid.problems.sorting.MergeThreeSortedArrays;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.MergeThreeSortedArraysInput;

public class MergeThreeSortedArrays extends AGProblemTemplate<MergeThreeSortedArraysInput, int[]> {
    @Override
    protected String problemName() {
        return "Merge Three Sorted Arrays";
    }

    @Override
    protected void validate(MergeThreeSortedArraysInput input) {
    }

    @Override
    protected MergeThreeSortedArraysInput copyInput(MergeThreeSortedArraysInput input) {
        return input;
    }

    @Override
    protected String formatInput(MergeThreeSortedArraysInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.sorting.mergeThreeSortedArrays";
    }
}
