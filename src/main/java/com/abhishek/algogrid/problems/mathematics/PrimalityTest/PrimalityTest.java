package com.abhishek.algogrid.problems.mathematics.PrimalityTest;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class PrimalityTest extends AGProblemTemplate<Integer, Boolean> {
    @Override
    protected String problemName() {
        return "Primality Test";
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
        return "problem.mathematics.primalityTest";
    }
}
