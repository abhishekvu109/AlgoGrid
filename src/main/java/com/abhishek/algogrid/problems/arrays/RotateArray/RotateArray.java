package com.abhishek.algogrid.problems.arrays.RotateArray;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.RotateArrayInput;

public class RotateArray extends AGProblemTemplate<RotateArrayInput, int[]> {
    @Override
    protected String problemName() {
        return "Rotate Array";
    }

    @Override
    protected void validate(RotateArrayInput input) {
    }

    @Override
    protected RotateArrayInput copyInput(RotateArrayInput input) {
        return input;
    }

    @Override
    protected String formatInput(RotateArrayInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.arrays.rotateArray";
    }
}
