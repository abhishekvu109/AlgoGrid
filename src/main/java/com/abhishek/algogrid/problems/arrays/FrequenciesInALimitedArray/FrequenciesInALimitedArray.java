package com.abhishek.algogrid.problems.arrays.FrequenciesInALimitedArray;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class FrequenciesInALimitedArray extends AGProblemTemplate<int[], int[]> {
    @Override
    protected String problemName() {
        return "Frequencies in a Limited Array";
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
        return "problem.arrays.frequenciesInALimitedArray";
    }
}
