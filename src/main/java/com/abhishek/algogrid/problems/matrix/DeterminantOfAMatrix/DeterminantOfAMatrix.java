package com.abhishek.algogrid.problems.matrix.DeterminantOfAMatrix;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class DeterminantOfAMatrix extends AGProblemTemplate<int[], Integer> {
    @Override
    protected String problemName() {
        return "Determinant of a Matrix";
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
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.matrix.determinantOfAMatrix";
    }
}
