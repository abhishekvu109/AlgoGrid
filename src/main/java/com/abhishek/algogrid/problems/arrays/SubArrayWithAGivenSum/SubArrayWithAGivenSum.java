package com.abhishek.algogrid.problems.arrays.SubArrayWithAGivenSum;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.SubArrayWithAGivenSumInput;

public class SubArrayWithAGivenSum extends AGProblemTemplate<SubArrayWithAGivenSumInput, int[]> {
    @Override
    protected String problemName() {
        return "Subarray with a Given Sum";
    }

    @Override
    protected void validate(SubArrayWithAGivenSumInput input) {
    }

    @Override
    protected SubArrayWithAGivenSumInput copyInput(SubArrayWithAGivenSumInput input) {
        return input;
    }

    @Override
    protected String formatInput(SubArrayWithAGivenSumInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.arrays.subArrayWithAGivenSum";
    }
}
