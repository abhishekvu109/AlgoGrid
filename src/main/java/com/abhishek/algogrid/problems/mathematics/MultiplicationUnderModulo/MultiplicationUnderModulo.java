package com.abhishek.algogrid.problems.mathematics.MultiplicationUnderModulo;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.MultiplicationUnderModuloInput;

public class MultiplicationUnderModulo extends AGProblemTemplate<MultiplicationUnderModuloInput, Long> {
    @Override
    protected String problemName() {
        return "Multiplication Under Modulo";
    }

    @Override
    protected void validate(MultiplicationUnderModuloInput input) {
    }

    @Override
    protected MultiplicationUnderModuloInput copyInput(MultiplicationUnderModuloInput input) {
        return input;
    }

    @Override
    protected String formatInput(MultiplicationUnderModuloInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Long output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.mathematics.multiplicationUnderModulo";
    }
}
