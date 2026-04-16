package com.abhishek.algogrid.problems.sorting.NumberOfPairs;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.NumberOfPairsInput;

public class NumberOfPairs extends AGProblemTemplate<NumberOfPairsInput, Long> {
    @Override
    protected String problemName() {
        return "Number of Pairs";
    }

    @Override
    protected void validate(NumberOfPairsInput input) {
    }

    @Override
    protected NumberOfPairsInput copyInput(NumberOfPairsInput input) {
        return input;
    }

    @Override
    protected String formatInput(NumberOfPairsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Long output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.sorting.numberOfPairs";
    }
}
