package com.abhishek.algogrid.problems.dp.ShortestCommonSupersequence;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.ShortestCommonSupersequenceInput;

public class ShortestCommonSupersequence extends AGProblemTemplate<ShortestCommonSupersequenceInput, Integer> {
    @Override
    protected String problemName() {
        return "Shortest Common Supersequence";
    }

    @Override
    protected void validate(ShortestCommonSupersequenceInput input) {
    }

    @Override
    protected ShortestCommonSupersequenceInput copyInput(ShortestCommonSupersequenceInput input) {
        return input;
    }

    @Override
    protected String formatInput(ShortestCommonSupersequenceInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.dp.shortestCommonSupersequence";
    }
}
