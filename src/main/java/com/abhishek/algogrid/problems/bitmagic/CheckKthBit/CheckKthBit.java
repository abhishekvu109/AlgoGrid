package com.abhishek.algogrid.problems.bitmagic.CheckKthBit;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.CheckKthBitInput;

public class CheckKthBit extends AGProblemTemplate<CheckKthBitInput, Boolean> {
    @Override
    protected String problemName() {
        return "Check K-th Bit";
    }

    @Override
    protected void validate(CheckKthBitInput input) {
    }

    @Override
    protected CheckKthBitInput copyInput(CheckKthBitInput input) {
        return input;
    }

    @Override
    protected String formatInput(CheckKthBitInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.bitmagic.checkKthBit";
    }
}
