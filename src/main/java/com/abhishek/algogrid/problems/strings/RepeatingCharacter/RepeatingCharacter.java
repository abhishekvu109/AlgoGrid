package com.abhishek.algogrid.problems.strings.RepeatingCharacter;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class RepeatingCharacter extends AGProblemTemplate<String, Character> {
    @Override
    protected String problemName() {
        return "Repeating Character";
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
        return "problem.strings.repeatingCharacter";
    }
}
