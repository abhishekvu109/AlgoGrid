package com.abhishek.algogrid.problems.segmenttree.RangeLongestCorrectBracketSubsequenceQueries;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.RangeLongestCorrectBracketSubsequenceQueriesInput;

public class RangeLongestCorrectBracketSubsequenceQueries extends AGProblemTemplate<RangeLongestCorrectBracketSubsequenceQueriesInput, Integer> {
    @Override
    protected String problemName() {
        return "Range Longest Correct Bracket Subsequence Queries";
    }

    @Override
    protected void validate(RangeLongestCorrectBracketSubsequenceQueriesInput input) {
    }

    @Override
    protected RangeLongestCorrectBracketSubsequenceQueriesInput copyInput(RangeLongestCorrectBracketSubsequenceQueriesInput input) {
        return input;
    }

    @Override
    protected String formatInput(RangeLongestCorrectBracketSubsequenceQueriesInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.segmenttree.rangeLongestCorrectBracketSubsequenceQueries";
    }
}
