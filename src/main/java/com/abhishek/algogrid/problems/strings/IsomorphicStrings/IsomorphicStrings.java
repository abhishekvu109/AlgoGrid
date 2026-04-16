package com.abhishek.algogrid.problems.strings.IsomorphicStrings;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.IsomorphicStringsInput;

public class IsomorphicStrings extends AGProblemTemplate<IsomorphicStringsInput, Boolean> {
    @Override
    protected String problemName() {
        return "Isomorphic Strings";
    }

    @Override
    protected void validate(IsomorphicStringsInput input) {
    }

    @Override
    protected IsomorphicStringsInput copyInput(IsomorphicStringsInput input) {
        return input;
    }

    @Override
    protected String formatInput(IsomorphicStringsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.isomorphicStrings";
    }
}
