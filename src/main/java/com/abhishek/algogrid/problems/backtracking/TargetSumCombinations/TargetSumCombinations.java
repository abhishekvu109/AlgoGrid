package com.abhishek.algogrid.problems.backtracking.TargetSumCombinations;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.TargetSumCombinationsInput;

public class TargetSumCombinations extends AGProblemTemplate<TargetSumCombinationsInput, String> {
    @Override
    protected String problemName() {
        return "Target Sum Combinations";
    }

    @Override
    protected void validate(TargetSumCombinationsInput input) {
    }

    @Override
    protected TargetSumCombinationsInput copyInput(TargetSumCombinationsInput input) {
        return input;
    }

    @Override
    protected String formatInput(TargetSumCombinationsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(String output) {
        return output;
    }

    @Override
    protected String strategyKey() {
        return "problem.backtracking.targetSumCombinations";
    }
}
