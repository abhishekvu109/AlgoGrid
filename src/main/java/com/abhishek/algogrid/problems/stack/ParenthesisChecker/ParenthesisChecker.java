package com.abhishek.algogrid.problems.stack.ParenthesisChecker;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class ParenthesisChecker extends AGProblemTemplate<String, Boolean> {
    @Override
    protected String problemName() {
        return "Parenthesis Checker";
    }

    @Override
    protected void validate(String input) {
    }

    @Override
    protected String copyInput(String input) {
        return input;
    }

    @Override
    protected String formatInput(String input) {
        return input;
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.stack.parenthesisChecker";
    }
}
