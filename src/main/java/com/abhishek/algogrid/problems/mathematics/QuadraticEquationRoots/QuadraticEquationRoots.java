package com.abhishek.algogrid.problems.mathematics.QuadraticEquationRoots;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class QuadraticEquationRoots extends AGProblemTemplate<double[], String> {
    @Override
    protected String problemName() {
        return "Quadratic Equation Roots";
    }

    @Override
    protected void validate(double[] input) {
    }

    @Override
    protected double[] copyInput(double[] input) {
        return input.clone();
    }

    @Override
    protected String formatInput(double[] input) {
        return Arrays.toString(input);
    }

    @Override
    protected String formatOutput(String output) {
        return output;
    }

    @Override
    protected String strategyKey() {
        return "problem.mathematics.quadraticEquationRoots";
    }
}
