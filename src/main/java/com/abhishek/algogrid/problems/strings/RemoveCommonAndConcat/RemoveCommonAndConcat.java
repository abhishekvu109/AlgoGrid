package com.abhishek.algogrid.problems.strings.RemoveCommonAndConcat;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.RemoveCommonAndConcatInput;

public class RemoveCommonAndConcat extends AGProblemTemplate<RemoveCommonAndConcatInput, String> {
    @Override
    protected String problemName() {
        return "Remove Common and Concat";
    }

    @Override
    protected void validate(RemoveCommonAndConcatInput input) {
    }

    @Override
    protected RemoveCommonAndConcatInput copyInput(RemoveCommonAndConcatInput input) {
        return input;
    }

    @Override
    protected String formatInput(RemoveCommonAndConcatInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(String output) {
        return output;
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.removeCommonAndConcat";
    }
}
