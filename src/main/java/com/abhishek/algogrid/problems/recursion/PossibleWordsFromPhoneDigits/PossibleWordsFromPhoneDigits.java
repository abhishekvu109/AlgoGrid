package com.abhishek.algogrid.problems.recursion.PossibleWordsFromPhoneDigits;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class PossibleWordsFromPhoneDigits extends AGProblemTemplate<String, String> {
    @Override
    protected String problemName() {
        return "Possible Words From Phone Digits";
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
        return "problem.recursion.possibleWordsFromPhoneDigits";
    }
}
