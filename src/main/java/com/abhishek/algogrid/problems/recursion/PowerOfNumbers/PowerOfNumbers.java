package com.abhishek.algogrid.problems.recursion.PowerOfNumbers;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.PowerOfNumbersInput;

public class PowerOfNumbers extends AGProblemTemplate<PowerOfNumbersInput, Double> {
    @Override
    protected String problemName() {
        return "Power Of Numbers";
    }

    @Override
    protected void validate(PowerOfNumbersInput input) {
    }

    @Override
    protected PowerOfNumbersInput copyInput(PowerOfNumbersInput input) {
        return input;
    }

    @Override
    protected String formatInput(PowerOfNumbersInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Double output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.recursion.powerOfNumbers";
    }
}
