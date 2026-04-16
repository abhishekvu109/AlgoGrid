package com.abhishek.algogrid.problems.strings.RabinKarpPatternSearching;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.RabinKarpPatternSearchingInput;

public class RabinKarpPatternSearching extends AGProblemTemplate<RabinKarpPatternSearchingInput, int[]> {
    @Override
    protected String problemName() {
        return "Rabin Karp Pattern Searching";
    }

    @Override
    protected void validate(RabinKarpPatternSearchingInput input) {
    }

    @Override
    protected RabinKarpPatternSearchingInput copyInput(RabinKarpPatternSearchingInput input) {
        return input;
    }

    @Override
    protected String formatInput(RabinKarpPatternSearchingInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.rabinKarpPatternSearching";
    }
}
