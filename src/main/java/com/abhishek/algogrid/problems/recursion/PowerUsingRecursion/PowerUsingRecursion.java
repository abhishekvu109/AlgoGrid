package com.abhishek.algogrid.problems.recursion.PowerUsingRecursion;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.PowerUsingRecursionInput;

public class PowerUsingRecursion extends AGProblemTemplate<PowerUsingRecursionInput, Long> {
    @Override
    protected String problemName() {
        return "Power Using Recursion";
    }

    @Override
    protected void validate(PowerUsingRecursionInput input) {
    }

    @Override
    protected PowerUsingRecursionInput copyInput(PowerUsingRecursionInput input) {
        return input;
    }

    @Override
    protected String formatInput(PowerUsingRecursionInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Long output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.recursion.powerUsingRecursion";
    }
}
