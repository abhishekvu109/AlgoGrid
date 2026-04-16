package com.abhishek.algogrid.problems.deque.RotateDequeByK;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.RotateDequeByKInput;

public class RotateDequeByK extends AGProblemTemplate<RotateDequeByKInput, int[]> {
    @Override
    protected String problemName() {
        return "Rotate Deque By K";
    }

    @Override
    protected void validate(RotateDequeByKInput input) {
    }

    @Override
    protected RotateDequeByKInput copyInput(RotateDequeByKInput input) {
        return input;
    }

    @Override
    protected String formatInput(RotateDequeByKInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.deque.rotateDequeByK";
    }
}
