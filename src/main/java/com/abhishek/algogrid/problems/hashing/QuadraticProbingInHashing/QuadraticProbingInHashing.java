package com.abhishek.algogrid.problems.hashing.QuadraticProbingInHashing;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class QuadraticProbingInHashing extends AGProblemTemplate<int[], String> {
    @Override
    protected String problemName() {
        return "Quadratic Probing in Hashing";
    }

    @Override
    protected void validate(int[] input) {
    }

    @Override
    protected int[] copyInput(int[] input) {
        return input.clone();
    }

    @Override
    protected String formatInput(int[] input) {
        return Arrays.toString(input);
    }

    @Override
    protected String formatOutput(String output) {
        return output;
    }

    @Override
    protected String strategyKey() {
        return "problem.hashing.quadraticProbingInHashing";
    }
}
