package com.abhishek.algogrid.problems.bitmagic.BitDifference;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.BitDifferenceInput;

public class BitDifference extends AGProblemTemplate<BitDifferenceInput, Integer> {
    @Override
    protected String problemName() {
        return "Bit Difference";
    }

    @Override
    protected void validate(BitDifferenceInput input) {
    }

    @Override
    protected BitDifferenceInput copyInput(BitDifferenceInput input) {
        return input;
    }

    @Override
    protected String formatInput(BitDifferenceInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.bitmagic.bitDifference";
    }
}
