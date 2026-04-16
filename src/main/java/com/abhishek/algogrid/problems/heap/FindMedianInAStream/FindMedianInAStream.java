package com.abhishek.algogrid.problems.heap.FindMedianInAStream;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class FindMedianInAStream extends AGProblemTemplate<int[], Double> {
    @Override
    protected String problemName() {
        return "Find Median in a Stream";
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
    protected String formatOutput(Double output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.heap.findMedianInAStream";
    }
}
