package com.abhishek.algogrid.problems.stack.PostfixEvaluation;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class PostfixEvaluation extends AGProblemTemplate<String, Integer> {
    @Override
    protected String problemName() {
        return "Postfix Evaluation";
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
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.stack.postfixEvaluation";
    }
}
