package com.abhishek.algogrid.problems.arrays.CheckIfArrayIsSorted;

import com.abhishek.algogrid.problems.AGProblemTemplate;

import java.util.Arrays;

public class CheckIfTheArrayIsSorted extends AGProblemTemplate<int[], Boolean> {
    @Override
    protected String problemName() {
        return "Check if the array is sorted.";
    }

    @Override
    protected void validate(int[] input) {
        if (input.length < 1)
            throw new IllegalArgumentException("Array can't be empty.");
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
    protected String formatOutput(Boolean output) {
        return output.toString();
    }

    @Override
    protected String strategyKey() {
        return "problem.arrays.checkIfTheArrayIsSorted";
    }
}
