package com.abhishek.algogrid.problems.strings.NonRepeatingCharacter;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class NonRepeatingCharacter extends AGProblemTemplate<String, Character> {
    @Override
    protected String problemName() {
        return "Non Repeating Character";
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
    protected String formatOutput(Character output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.nonRepeatingCharacter";
    }
}
