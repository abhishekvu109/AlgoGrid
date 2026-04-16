package com.abhishek.algogrid.problems.heap.RearrangeCharacters;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class RearrangeCharacters extends AGProblemTemplate<String, String> {
    @Override
    protected String problemName() {
        return "Rearrange Characters";
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
        return "problem.heap.rearrangeCharacters";
    }
}
