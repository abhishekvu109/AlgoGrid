package com.abhishek.algogrid.problems.mathematics.ConvertCelsiusToFahrenheit;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class ConvertCelsiusToFahrenheit extends AGProblemTemplate<Double, Double> {
    @Override
    protected String problemName() {
        return "Convert Celsius to Fahrenheit";
    }

    @Override
    protected void validate(Double input) {
    }

    @Override
    protected Double copyInput(Double input) {
        return input;
    }

    @Override
    protected String formatInput(Double input) {
        return String.valueOf(input);
    }

    @Override
    protected String formatOutput(Double output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.mathematics.convertCelsiusToFahrenheit";
    }
}
