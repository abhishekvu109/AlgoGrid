package com.abhishek.algogrid.problems.sorting.CountInversions;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class CountInversions extends AGProblemTemplate<int[], Long> {
    @Override
    protected String problemName() {
        return "Count Inversions";
    }

    @Override
    protected void validate(int[] input) {
    }

    @Override
    protected int[] copyInput(int[] input) {
        return input.clone();
    }

    @Override
    protected String formatInput(int[] input) {
        return Arrays.toString(input);
    }

    @Override
    protected String formatOutput(Long output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.sorting.countInversions";
    }
}
