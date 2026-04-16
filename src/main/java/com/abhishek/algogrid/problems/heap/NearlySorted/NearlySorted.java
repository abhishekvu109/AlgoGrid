package com.abhishek.algogrid.problems.heap.NearlySorted;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.NearlySortedInput;

public class NearlySorted extends AGProblemTemplate<NearlySortedInput, int[]> {
    @Override
    protected String problemName() {
        return "Nearly Sorted";
    }

    @Override
    protected void validate(NearlySortedInput input) {
    }

    @Override
    protected NearlySortedInput copyInput(NearlySortedInput input) {
        return input;
    }

    @Override
    protected String formatInput(NearlySortedInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.heap.nearlySorted";
    }
}
