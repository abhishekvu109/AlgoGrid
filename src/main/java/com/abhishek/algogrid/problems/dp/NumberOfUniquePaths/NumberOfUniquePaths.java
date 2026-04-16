package com.abhishek.algogrid.problems.dp.NumberOfUniquePaths;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.NumberOfUniquePathsInput;

public class NumberOfUniquePaths extends AGProblemTemplate<NumberOfUniquePathsInput, Integer> {
    @Override
    protected String problemName() {
        return "Number of Unique Paths";
    }

    @Override
    protected void validate(NumberOfUniquePathsInput input) {
    }

    @Override
    protected NumberOfUniquePathsInput copyInput(NumberOfUniquePathsInput input) {
        return input;
    }

    @Override
    protected String formatInput(NumberOfUniquePathsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.dp.numberOfUniquePaths";
    }
}
