package com.abhishek.algogrid.problems.hashing.CountNonRepeatedElements;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class CountNonRepeatedElements extends AGProblemTemplate<int[], Integer> {
    @Override
    protected String problemName() {
        return "Count Non-Repeated Elements";
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
        return "problem.hashing.countNonRepeatedElements";
    }
}
