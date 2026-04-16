package com.abhishek.algogrid.problems.arrays.RearrangeArrayWithO1Space;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class RearrangeArrayWithO1Space extends AGProblemTemplate<int[], int[]> {
    @Override
    protected String problemName() {
        return "Rearrange Array with O(1) Extra Space";
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
        return "problem.arrays.rearrangeArrayWithO1Space";
    }
}
