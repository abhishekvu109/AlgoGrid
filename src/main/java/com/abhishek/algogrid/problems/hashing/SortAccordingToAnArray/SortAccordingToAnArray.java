package com.abhishek.algogrid.problems.hashing.SortAccordingToAnArray;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.SortAccordingToAnArrayInput;

public class SortAccordingToAnArray extends AGProblemTemplate<SortAccordingToAnArrayInput, int[]> {
    @Override
    protected String problemName() {
        return "Sort According to an Array";
    }

    @Override
    protected void validate(SortAccordingToAnArrayInput input) {
    }

    @Override
    protected SortAccordingToAnArrayInput copyInput(SortAccordingToAnArrayInput input) {
        return input;
    }

    @Override
    protected String formatInput(SortAccordingToAnArrayInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.hashing.sortAccordingToAnArray";
    }
}
