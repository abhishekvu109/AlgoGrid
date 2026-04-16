package com.abhishek.algogrid.problems.mathematics.GPTerm;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.GPTermInput;

public class GPTerm extends AGProblemTemplate<GPTermInput, Long> {
    @Override
    protected String problemName() {
        return "GP Term";
    }

    @Override
    protected void validate(GPTermInput input) {
    }

    @Override
    protected GPTermInput copyInput(GPTermInput input) {
        return input;
    }

    @Override
    protected String formatInput(GPTermInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Long output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.mathematics.gpTerm";
    }
}
