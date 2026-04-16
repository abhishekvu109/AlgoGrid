package com.abhishek.algogrid.problems.dp.LongestCommonSubsequence;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.LongestCommonSubsequenceInput;

public class LongestCommonSubsequence extends AGProblemTemplate<LongestCommonSubsequenceInput, Integer> {
    @Override
    protected String problemName() {
        return "Longest Common Subsequence";
    }

    @Override
    protected void validate(LongestCommonSubsequenceInput input) {
    }

    @Override
    protected LongestCommonSubsequenceInput copyInput(LongestCommonSubsequenceInput input) {
        return input;
    }

    @Override
    protected String formatInput(LongestCommonSubsequenceInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.dp.longestCommonSubsequence";
    }
}
