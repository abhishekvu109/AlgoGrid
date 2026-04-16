package com.abhishek.algogrid.problems.strings.MostFrequentCharacter;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class MostFrequentCharacter extends AGProblemTemplate<String, Character> {
    @Override
    protected String problemName() {
        return "Most Frequent Character";
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
        return "problem.strings.mostFrequentCharacter";
    }
}
