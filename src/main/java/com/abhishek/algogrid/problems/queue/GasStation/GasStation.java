package com.abhishek.algogrid.problems.queue.GasStation;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class GasStation extends AGProblemTemplate<int[], Integer> {
    @Override
    protected String problemName() {
        return "Gas Station";
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
        return "problem.queue.gasStation";
    }
}
