package com.abhishek.algogrid.problems.strings.Anagram;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.AnagramInput;

public class Anagram extends AGProblemTemplate<AnagramInput, Boolean> {
    @Override
    protected String problemName() {
        return "Anagram";
    }

    @Override
    protected void validate(AnagramInput input) {
    }

    @Override
    protected AnagramInput copyInput(AnagramInput input) {
        return input;
    }

    @Override
    protected String formatInput(AnagramInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.anagram";
    }
}
