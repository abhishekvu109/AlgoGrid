package com.abhishek.algogrid.problems.arrays.MeanAndMedianOfArray;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class MeanAndMedianOfArray extends AGProblemTemplate<int[], double[]> {
    @Override
    protected String problemName() {
        return "Mean And Median of Array";
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
    protected String formatOutput(double[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.arrays.meanAndMedianOfArray";
    }
}
