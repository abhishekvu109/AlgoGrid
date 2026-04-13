package com.abhishek.algogrid.problems.arrays.MoveZeroToEnd;

import com.abhishek.algogrid.problems.AGProblemTemplate;

import java.util.Arrays;

public class MoveZeroToEnd extends AGProblemTemplate<int[],int[]> {
    @Override
    protected String problemName() {
        return "Move zeros to the end.";
    }

    @Override
    protected void validate(int[] input) {
        if(input.length==0){
            throw new IllegalArgumentException("Length of an array shold be more.");
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
        return "problem.arrays.moveZerosToEnd";
    }
}
