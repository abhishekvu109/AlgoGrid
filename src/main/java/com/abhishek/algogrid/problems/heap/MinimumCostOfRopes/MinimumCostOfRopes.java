package com.abhishek.algogrid.problems.heap.MinimumCostOfRopes;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class MinimumCostOfRopes extends AGProblemTemplate<int[], Long> {
    @Override
    protected String problemName() {
        return "Minimum Cost of Ropes";
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
    protected String formatOutput(Long output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.heap.minimumCostOfRopes";
    }
}
