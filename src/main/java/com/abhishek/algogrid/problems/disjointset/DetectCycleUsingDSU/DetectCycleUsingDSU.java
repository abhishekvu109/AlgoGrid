package com.abhishek.algogrid.problems.disjointset.DetectCycleUsingDSU;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class DetectCycleUsingDSU extends AGProblemTemplate<int[], Boolean> {
    @Override
    protected String problemName() {
        return "Detect Cycle using DSU";
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
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.disjointset.detectCycleUsingDSU";
    }
}
