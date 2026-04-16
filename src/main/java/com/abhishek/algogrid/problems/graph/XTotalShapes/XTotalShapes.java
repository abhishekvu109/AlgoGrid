package com.abhishek.algogrid.problems.graph.XTotalShapes;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class XTotalShapes extends AGProblemTemplate<int[], Integer> {
    @Override
    protected String problemName() {
        return "X Total Shapes";
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
        return "problem.graph.xTotalShapes";
    }
}
