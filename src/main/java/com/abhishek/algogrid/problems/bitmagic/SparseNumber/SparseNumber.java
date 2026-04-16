package com.abhishek.algogrid.problems.bitmagic.SparseNumber;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class SparseNumber extends AGProblemTemplate<Integer, Boolean> {
    @Override
    protected String problemName() {
        return "Sparse Number";
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
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.bitmagic.sparseNumber";
    }
}
