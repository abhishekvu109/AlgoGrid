package com.abhishek.algogrid.problems.arrays.ReverseAnArray;

import com.abhishek.algogrid.problems.AGProblemTemplate;

import java.util.Arrays;

public class ReverseAnArray extends AGProblemTemplate<int[],int[]> {
    @Override
    protected String problemName() {
        return "Reverse an array.";
    }

    @Override
    protected void validate(int[] input) {

    }

    @Override
    protected int[] copyInput(int[] input) {
        return input;
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
        return "problem.arrays.reverseAnArray";
    }
}
