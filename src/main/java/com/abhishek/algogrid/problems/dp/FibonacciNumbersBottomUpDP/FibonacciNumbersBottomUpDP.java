package com.abhishek.algogrid.problems.dp.FibonacciNumbersBottomUpDP;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class FibonacciNumbersBottomUpDP extends AGProblemTemplate<Integer, Long> {
    @Override
    protected String problemName() {
        return "Fibonacci Numbers - Bottom Up DP";
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
        return "problem.dp.fibonacciNumbersBottomUpDP";
    }
}
