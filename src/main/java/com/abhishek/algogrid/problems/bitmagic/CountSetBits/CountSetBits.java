package com.abhishek.algogrid.problems.bitmagic.CountSetBits;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class CountSetBits extends AGProblemTemplate<Integer, Integer> {
    @Override
    protected String problemName() {
        return "Count Set Bits";
    }

    @Override
    protected void validate(Integer input) {
    }

    @Override
    protected Integer copyInput(Integer input) {
        return input;
    }

    @Override
    protected String formatInput(Integer input) {
        return String.valueOf(input);
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.bitmagic.countSetBits";
    }
}
