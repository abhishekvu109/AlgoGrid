package com.abhishek.algogrid.problems.arrays.RemoveDuplicateFromASortedArray;

import com.abhishek.algogrid.problems.AGProblemTemplate;

import java.util.Arrays;

public class RemoveDuplicateFromASortedArray extends AGProblemTemplate<int[], int[]> {
    @Override
    protected String problemName() {
        return "Remove duplicate from a sorted array.";
    }

    @Override
    protected void validate(int[] input) {
        if (input.length < 2) {
            throw new IllegalArgumentException("Illegal argument passed.");
        }
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
        return "problem.arrays.removeDuplicateFromASortedArray";
    }
}
