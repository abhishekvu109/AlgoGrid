package com.abhishek.algogrid.problems.dp.NthCatalanNumber;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class NthCatalanNumber extends AGProblemTemplate<Integer, Long> {
    @Override
    protected String problemName() {
        return "Nth Catalan Number";
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
    protected String formatOutput(Long output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.dp.nthCatalanNumber";
    }
}
