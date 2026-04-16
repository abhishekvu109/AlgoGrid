package com.abhishek.algogrid.problems.arrays.MinimumAdjacentDifferenceInCircularArray;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class MinimumAdjacentDifferenceInCircularArray extends AGProblemTemplate<int[], Integer> {
    @Override
    protected String problemName() {
        return "Minimum Adjacent Difference in Circular Array";
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
        return "problem.arrays.minimumAdjacentDifferenceInCircularArray";
    }
}
