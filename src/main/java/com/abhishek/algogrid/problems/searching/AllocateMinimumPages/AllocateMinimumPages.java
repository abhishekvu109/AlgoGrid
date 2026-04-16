package com.abhishek.algogrid.problems.searching.AllocateMinimumPages;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.AllocateMinimumPagesInput;

public class AllocateMinimumPages extends AGProblemTemplate<AllocateMinimumPagesInput, Integer> {
    @Override
    protected String problemName() {
        return "Allocate Minimum Pages";
    }

    @Override
    protected void validate(AllocateMinimumPagesInput input) {
    }

    @Override
    protected AllocateMinimumPagesInput copyInput(AllocateMinimumPagesInput input) {
        return input;
    }

    @Override
    protected String formatInput(AllocateMinimumPagesInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.searching.allocateMinimumPages";
    }
}
