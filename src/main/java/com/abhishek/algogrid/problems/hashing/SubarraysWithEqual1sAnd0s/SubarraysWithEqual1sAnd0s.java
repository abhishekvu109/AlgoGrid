package com.abhishek.algogrid.problems.hashing.SubarraysWithEqual1sAnd0s;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class SubarraysWithEqual1sAnd0s extends AGProblemTemplate<int[], Integer> {
    @Override
    protected String problemName() {
        return "Subarrays with Equal 1s and 0s";
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
        return "problem.hashing.subarraysWithEqual1sAnd0s";
    }
}
