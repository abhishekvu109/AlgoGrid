package com.abhishek.algogrid.problems.strings.FirstOccurence;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.FirstOccurenceInput;

public class FirstOccurence extends AGProblemTemplate<FirstOccurenceInput, Integer> {
    @Override
    protected String problemName() {
        return "First Occurence";
    }

    @Override
    protected void validate(FirstOccurenceInput input) {
    }

    @Override
    protected FirstOccurenceInput copyInput(FirstOccurenceInput input) {
        return input;
    }

    @Override
    protected String formatInput(FirstOccurenceInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.firstOccurence";
    }
}
