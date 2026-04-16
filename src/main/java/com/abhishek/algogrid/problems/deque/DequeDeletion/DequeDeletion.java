package com.abhishek.algogrid.problems.deque.DequeDeletion;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class DequeDeletion extends AGProblemTemplate<Integer, String> {
    @Override
    protected String problemName() {
        return "Deque Deletion";
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
        return "problem.deque.dequeDeletion";
    }
}
