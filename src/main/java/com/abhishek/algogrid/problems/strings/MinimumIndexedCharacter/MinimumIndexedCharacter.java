package com.abhishek.algogrid.problems.strings.MinimumIndexedCharacter;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.MinimumIndexedCharacterInput;

public class MinimumIndexedCharacter extends AGProblemTemplate<MinimumIndexedCharacterInput, Integer> {
    @Override
    protected String problemName() {
        return "Minimum Indexed Character";
    }

    @Override
    protected void validate(MinimumIndexedCharacterInput input) {
    }

    @Override
    protected MinimumIndexedCharacterInput copyInput(MinimumIndexedCharacterInput input) {
        return input;
    }

    @Override
    protected String formatInput(MinimumIndexedCharacterInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.minimumIndexedCharacter";
    }
}
