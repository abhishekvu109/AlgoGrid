package com.abhishek.algogrid.problems.sorting.MinimumDifferenceInAnArray;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class MinimumDifferenceInAnArray extends AGProblemTemplate<int[], Integer> {
    @Override
    protected String problemName() {
        return "Minimum Difference in an Array";
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
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.sorting.minimumDifferenceInAnArray";
    }
}
