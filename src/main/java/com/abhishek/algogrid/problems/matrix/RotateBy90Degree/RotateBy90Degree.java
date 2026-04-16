package com.abhishek.algogrid.problems.matrix.RotateBy90Degree;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class RotateBy90Degree extends AGProblemTemplate<int[], int[]> {
    @Override
    protected String problemName() {
        return "Rotate by 90 Degree";
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
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.matrix.rotateBy90Degree";
    }
}
