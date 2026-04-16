package com.abhishek.algogrid.problems.strings.SmallestWindowContainingAllCharacters;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.SmallestWindowContainingAllCharactersInput;

public class SmallestWindowContainingAllCharacters extends AGProblemTemplate<SmallestWindowContainingAllCharactersInput, String> {
    @Override
    protected String problemName() {
        return "Smallest Window Containing All Characters";
    }

    @Override
    protected void validate(SmallestWindowContainingAllCharactersInput input) {
    }

    @Override
    protected SmallestWindowContainingAllCharactersInput copyInput(SmallestWindowContainingAllCharactersInput input) {
        return input;
    }

    @Override
    protected String formatInput(SmallestWindowContainingAllCharactersInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(String output) {
        return output;
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.smallestWindowContainingAllCharacters";
    }
}
