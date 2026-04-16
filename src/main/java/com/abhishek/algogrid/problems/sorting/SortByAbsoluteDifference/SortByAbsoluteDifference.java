package com.abhishek.algogrid.problems.sorting.SortByAbsoluteDifference;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.SortByAbsoluteDifferenceInput;

public class SortByAbsoluteDifference extends AGProblemTemplate<SortByAbsoluteDifferenceInput, int[]> {
    @Override
    protected String problemName() {
        return "Sort by Absolute Difference";
    }

    @Override
    protected void validate(SortByAbsoluteDifferenceInput input) {
    }

    @Override
    protected SortByAbsoluteDifferenceInput copyInput(SortByAbsoluteDifferenceInput input) {
        return input;
    }

    @Override
    protected String formatInput(SortByAbsoluteDifferenceInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.sorting.sortByAbsoluteDifference";
    }
}
