package com.abhishek.algogrid.problems.recursion.NthFibonacciUsingRecursion;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class NthFibonacciUsingRecursion extends AGProblemTemplate<Integer, Long> {
    @Override
    protected String problemName() {
        return "Nth Fibonacci Using Recursion";
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
        return "problem.recursion.nthFibonacciUsingRecursion";
    }
}
