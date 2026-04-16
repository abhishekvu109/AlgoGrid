package com.abhishek.algogrid.problems.mathematics.AdditionUnderModulo;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.AdditionUnderModuloInput;

public class AdditionUnderModulo extends AGProblemTemplate<AdditionUnderModuloInput, Long> {
    @Override
    protected String problemName() {
        return "Addition Under Modulo";
    }

    @Override
    protected void validate(AdditionUnderModuloInput input) {
    }

    @Override
    protected AdditionUnderModuloInput copyInput(AdditionUnderModuloInput input) {
        return input;
    }

    @Override
    protected String formatInput(AdditionUnderModuloInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Long output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.mathematics.additionUnderModulo";
    }
}
