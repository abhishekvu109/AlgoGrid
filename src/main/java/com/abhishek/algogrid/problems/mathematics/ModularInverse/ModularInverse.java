package com.abhishek.algogrid.problems.mathematics.ModularInverse;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.ModularInverseInput;

public class ModularInverse extends AGProblemTemplate<ModularInverseInput, Integer> {
    @Override
    protected String problemName() {
        return "Modular Inverse";
    }

    @Override
    protected void validate(ModularInverseInput input) {
    }

    @Override
    protected ModularInverseInput copyInput(ModularInverseInput input) {
        return input;
    }

    @Override
    protected String formatInput(ModularInverseInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.mathematics.modularInverse";
    }
}
