package com.abhishek.algogrid.problems.arrays.MaximumOccuredInteger;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.MaximumOccuredIntegerInput;

public class MaximumOccuredInteger extends AGProblemTemplate<MaximumOccuredIntegerInput, Integer> {
    @Override
    protected String problemName() {
        return "Maximum Occurred Integer";
    }

    @Override
    protected void validate(MaximumOccuredIntegerInput input) {
    }

    @Override
    protected MaximumOccuredIntegerInput copyInput(MaximumOccuredIntegerInput input) {
        return input;
    }

    @Override
    protected String formatInput(MaximumOccuredIntegerInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.arrays.maximumOccuredInteger";
    }
}
