package com.abhishek.algogrid.problems.binarysearchtree.MergeTwoBSTs;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.MergeTwoBSTsInput;

public class MergeTwoBSTs extends AGProblemTemplate<MergeTwoBSTsInput, int[]> {
    @Override
    protected String problemName() {
        return "Merge Two BSTs";
    }

    @Override
    protected void validate(MergeTwoBSTsInput input) {
    }

    @Override
    protected MergeTwoBSTsInput copyInput(MergeTwoBSTsInput input) {
        return input;
    }

    @Override
    protected String formatInput(MergeTwoBSTsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.mergeTwoBSTs";
    }
}
