package com.abhishek.algogrid.problems.strings.PatternSearch;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.PatternSearchInput;

public class PatternSearch extends AGProblemTemplate<PatternSearchInput, int[]> {
    @Override
    protected String problemName() {
        return "Pattern Search";
    }

    @Override
    protected void validate(PatternSearchInput input) {
    }

    @Override
    protected PatternSearchInput copyInput(PatternSearchInput input) {
        return input;
    }

    @Override
    protected String formatInput(PatternSearchInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.patternSearch";
    }
}
