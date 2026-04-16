package com.abhishek.algogrid.problems.mathematics.Exactly3Divisors;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class Exactly3Divisors extends AGProblemTemplate<Integer, Integer> {
    @Override
    protected String problemName() {
        return "Exactly 3 Divisors";
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
        return "problem.mathematics.exactly3Divisors";
    }
}
