package com.abhishek.algogrid.problems.searching.LeftIndex;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.LeftIndexInput;

public class LeftIndex extends AGProblemTemplate<LeftIndexInput, Integer> {
    @Override
    protected String problemName() {
        return "Left Index";
    }

    @Override
    protected void validate(LeftIndexInput input) {
    }

    @Override
    protected LeftIndexInput copyInput(LeftIndexInput input) {
        return input;
    }

    @Override
    protected String formatInput(LeftIndexInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.searching.leftIndex";
    }
}
