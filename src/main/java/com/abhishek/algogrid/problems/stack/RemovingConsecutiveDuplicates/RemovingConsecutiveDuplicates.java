package com.abhishek.algogrid.problems.stack.RemovingConsecutiveDuplicates;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class RemovingConsecutiveDuplicates extends AGProblemTemplate<String, String> {
    @Override
    protected String problemName() {
        return "Removing Consecutive Duplicates";
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
    protected String formatOutput(String output) {
        return output;
    }

    @Override
    protected String strategyKey() {
        return "problem.stack.removingConsecutiveDuplicates";
    }
}
