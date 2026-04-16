package com.abhishek.algogrid.problems.searching.MoreThanNKOccurrences;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.MoreThanNKOccurrencesInput;

public class MoreThanNKOccurrences extends AGProblemTemplate<MoreThanNKOccurrencesInput, int[]> {
    @Override
    protected String problemName() {
        return "More than n/k Occurrences";
    }

    @Override
    protected void validate(MoreThanNKOccurrencesInput input) {
    }

    @Override
    protected MoreThanNKOccurrencesInput copyInput(MoreThanNKOccurrencesInput input) {
        return input;
    }

    @Override
    protected String formatInput(MoreThanNKOccurrencesInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.searching.moreThanNKOccurrences";
    }
}
