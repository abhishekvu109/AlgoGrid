package com.abhishek.algogrid.problems.tree.MaximumWidthOfTree;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class MaximumWidthOfTree extends AGProblemTemplate<int[], Integer> {
    @Override
    protected String problemName() {
        return "Maximum Width of Tree";
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
        return "problem.tree.maximumWidthOfTree";
    }
}
