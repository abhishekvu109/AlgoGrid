package com.abhishek.algogrid.problems.strings.BinaryString;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class BinaryString extends AGProblemTemplate<String, Integer> {
    @Override
    protected String problemName() {
        return "Binary String";
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
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.binaryString";
    }
}
