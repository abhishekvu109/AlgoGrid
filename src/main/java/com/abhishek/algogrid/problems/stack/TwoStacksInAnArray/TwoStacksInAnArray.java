package com.abhishek.algogrid.problems.stack.TwoStacksInAnArray;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class TwoStacksInAnArray extends AGProblemTemplate<Integer, String> {
    @Override
    protected String problemName() {
        return "Two Stacks in an Array";
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
    protected String formatOutput(String output) {
        return output;
    }

    @Override
    protected String strategyKey() {
        return "problem.stack.twoStacksInAnArray";
    }
}
