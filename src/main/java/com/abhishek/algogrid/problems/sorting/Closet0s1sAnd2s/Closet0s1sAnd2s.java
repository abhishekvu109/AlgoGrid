package com.abhishek.algogrid.problems.sorting.Closet0s1sAnd2s;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class Closet0s1sAnd2s extends AGProblemTemplate<int[], int[]> {
    @Override
    protected String problemName() {
        return "Closet 0s 1s and 2s";
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
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.sorting.closet0s1sAnd2s";
    }
}
