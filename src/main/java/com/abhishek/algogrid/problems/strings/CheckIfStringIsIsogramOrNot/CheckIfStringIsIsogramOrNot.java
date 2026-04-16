package com.abhishek.algogrid.problems.strings.CheckIfStringIsIsogramOrNot;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class CheckIfStringIsIsogramOrNot extends AGProblemTemplate<String, Boolean> {
    @Override
    protected String problemName() {
        return "Check if String is Isogram or Not";
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
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.checkIfStringIsIsogramOrNot";
    }
}
