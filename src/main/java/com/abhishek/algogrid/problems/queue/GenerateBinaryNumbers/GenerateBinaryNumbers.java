package com.abhishek.algogrid.problems.queue.GenerateBinaryNumbers;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class GenerateBinaryNumbers extends AGProblemTemplate<Integer, String[]> {
    @Override
    protected String problemName() {
        return "Generate Binary Numbers";
    }

    @Override
    protected void validate(Integer input) {
    }

    @Override
    protected Integer copyInput(Integer input) {
        return input;
    }

    @Override
    protected String formatInput(Integer input) {
        return String.valueOf(input);
    }

    @Override
    protected String formatOutput(String[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.queue.generateBinaryNumbers";
    }
}
