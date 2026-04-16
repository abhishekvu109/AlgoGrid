package com.abhishek.algogrid.problems.backtracking.LargestNumberInKSwaps;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.LargestNumberInKSwapsInput;

public class LargestNumberInKSwaps extends AGProblemTemplate<LargestNumberInKSwapsInput, String> {
    @Override
    protected String problemName() {
        return "Largest Number in K Swaps";
    }

    @Override
    protected void validate(LargestNumberInKSwapsInput input) {
    }

    @Override
    protected LargestNumberInKSwapsInput copyInput(LargestNumberInKSwapsInput input) {
        return input;
    }

    @Override
    protected String formatInput(LargestNumberInKSwapsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(String output) {
        return output;
    }

    @Override
    protected String strategyKey() {
        return "problem.backtracking.largestNumberInKSwaps";
    }
}
