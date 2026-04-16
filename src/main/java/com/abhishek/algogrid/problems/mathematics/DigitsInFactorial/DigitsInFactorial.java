package com.abhishek.algogrid.problems.mathematics.DigitsInFactorial;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class DigitsInFactorial extends AGProblemTemplate<Integer, Integer> {
    @Override
    protected String problemName() {
        return "Digits In Factorial";
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
        return "problem.mathematics.digitsInFactorial";
    }
}
