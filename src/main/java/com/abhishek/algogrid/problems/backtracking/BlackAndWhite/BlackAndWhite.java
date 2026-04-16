package com.abhishek.algogrid.problems.backtracking.BlackAndWhite;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class BlackAndWhite extends AGProblemTemplate<int[], Integer> {
    @Override
    protected String problemName() {
        return "Black and White";
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
        return "problem.backtracking.blackAndWhite";
    }
}
