package com.abhishek.algogrid.problems.strings.CaseSpecificSortingOfStrings;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class CaseSpecificSortingOfStrings extends AGProblemTemplate<String, String> {
    @Override
    protected String problemName() {
        return "Case-Specific Sorting of Strings";
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
        return "problem.strings.caseSpecificSortingOfStrings";
    }
}
