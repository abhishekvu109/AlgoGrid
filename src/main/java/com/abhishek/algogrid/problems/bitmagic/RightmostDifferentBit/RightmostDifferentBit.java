package com.abhishek.algogrid.problems.bitmagic.RightmostDifferentBit;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.RightmostDifferentBitInput;

public class RightmostDifferentBit extends AGProblemTemplate<RightmostDifferentBitInput, Integer> {
    @Override
    protected String problemName() {
        return "Rightmost Different Bit";
    }

    @Override
    protected void validate(RightmostDifferentBitInput input) {
    }

    @Override
    protected RightmostDifferentBitInput copyInput(RightmostDifferentBitInput input) {
        return input;
    }

    @Override
    protected String formatInput(RightmostDifferentBitInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.bitmagic.rightmostDifferentBit";
    }
}
