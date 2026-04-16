package com.abhishek.algogrid.problems.strings.CheckIfStringIsSubsequenceOfOther;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.CheckIfStringIsSubsequenceOfOtherInput;

public class CheckIfStringIsSubsequenceOfOther extends AGProblemTemplate<CheckIfStringIsSubsequenceOfOtherInput, Boolean> {
    @Override
    protected String problemName() {
        return "Check if String is Subsequence of Other";
    }

    @Override
    protected void validate(CheckIfStringIsSubsequenceOfOtherInput input) {
    }

    @Override
    protected CheckIfStringIsSubsequenceOfOtherInput copyInput(CheckIfStringIsSubsequenceOfOtherInput input) {
        return input;
    }

    @Override
    protected String formatInput(CheckIfStringIsSubsequenceOfOtherInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.checkIfStringIsSubsequenceOfOther";
    }
}
