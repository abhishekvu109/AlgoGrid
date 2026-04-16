package com.abhishek.algogrid.problems.strings.LexicographicRankOfAString;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class LexicographicRankOfAString extends AGProblemTemplate<String, Long> {
    @Override
    protected String problemName() {
        return "Lexicographic Rank Of A String";
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
    protected String formatOutput(Long output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.lexicographicRankOfAString";
    }
}
