package com.abhishek.algogrid.problems.arrays.SecondLargestElementInAnArray;

import com.abhishek.algogrid.problems.AGProblemTemplate;

import java.util.Arrays;

public class SecondLargestElementInAnArray extends AGProblemTemplate<int[], Integer> {

    @Override
    protected String problemName() {
        return "Second largest element in an array.";
    }

    @Override
    protected void validate(int[] input) {
        if(input.length<1)
            throw new IllegalArgumentException("Invalid length");
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
    protected String formatOutput(Integer output) {
        return output.toString();
    }

    @Override
    protected String strategyKey() {
        return "problem.arrays.secondLargestElementInAnArray";
    }
}
