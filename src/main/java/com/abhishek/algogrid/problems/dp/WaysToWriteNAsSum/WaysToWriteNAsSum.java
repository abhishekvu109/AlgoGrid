package com.abhishek.algogrid.problems.dp.WaysToWriteNAsSum;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.WaysToWriteNAsSumInput;

public class WaysToWriteNAsSum extends AGProblemTemplate<WaysToWriteNAsSumInput, Integer> {
    @Override
    protected String problemName() {
        return "Ways to Write n as Sum";
    }

    @Override
    protected void validate(WaysToWriteNAsSumInput input) {
    }

    @Override
    protected WaysToWriteNAsSumInput copyInput(WaysToWriteNAsSumInput input) {
        return input;
    }

    @Override
    protected String formatInput(WaysToWriteNAsSumInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.dp.waysToWriteNAsSum";
    }
}
