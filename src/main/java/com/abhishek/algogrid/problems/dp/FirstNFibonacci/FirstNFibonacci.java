package com.abhishek.algogrid.problems.dp.FirstNFibonacci;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class FirstNFibonacci extends AGProblemTemplate<Integer, int[]> {
    @Override
    protected String problemName() {
        return "First n Fibonacci";
    }

    @Override
    protected void validate(Integer input) {
    }

    @Override
    protected Integer copyInput(Integer input) {
        return input;
    }

    @Override
    protected String formatInput(Integer input) {
        return String.valueOf(input);
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.dp.firstNFibonacci";
    }
}
