package com.abhishek.algogrid.problems.strings.NaivePatternSearch;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.NaivePatternSearchInput;

public class NaivePatternSearch extends AGProblemTemplate<NaivePatternSearchInput, int[]> {
    @Override
    protected String problemName() {
        return "Naive Pattern Search";
    }

    @Override
    protected void validate(NaivePatternSearchInput input) {
    }

    @Override
    protected NaivePatternSearchInput copyInput(NaivePatternSearchInput input) {
        return input;
    }

    @Override
    protected String formatInput(NaivePatternSearchInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.naivePatternSearch";
    }
}
