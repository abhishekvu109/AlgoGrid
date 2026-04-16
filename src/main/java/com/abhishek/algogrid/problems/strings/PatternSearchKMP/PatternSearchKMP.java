package com.abhishek.algogrid.problems.strings.PatternSearchKMP;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.PatternSearchKMPInput;

public class PatternSearchKMP extends AGProblemTemplate<PatternSearchKMPInput, int[]> {
    @Override
    protected String problemName() {
        return "Pattern Search KMP";
    }

    @Override
    protected void validate(PatternSearchKMPInput input) {
    }

    @Override
    protected PatternSearchKMPInput copyInput(PatternSearchKMPInput input) {
        return input;
    }

    @Override
    protected String formatInput(PatternSearchKMPInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.patternSearchKMP";
    }
}
