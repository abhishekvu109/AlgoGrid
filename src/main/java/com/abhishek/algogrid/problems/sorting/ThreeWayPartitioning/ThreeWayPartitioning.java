package com.abhishek.algogrid.problems.sorting.ThreeWayPartitioning;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.ThreeWayPartitioningInput;

public class ThreeWayPartitioning extends AGProblemTemplate<ThreeWayPartitioningInput, int[]> {
    @Override
    protected String problemName() {
        return "Three Way Partitioning";
    }

    @Override
    protected void validate(ThreeWayPartitioningInput input) {
    }

    @Override
    protected ThreeWayPartitioningInput copyInput(ThreeWayPartitioningInput input) {
        return input;
    }

    @Override
    protected String formatInput(ThreeWayPartitioningInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.sorting.threeWayPartitioning";
    }
}
