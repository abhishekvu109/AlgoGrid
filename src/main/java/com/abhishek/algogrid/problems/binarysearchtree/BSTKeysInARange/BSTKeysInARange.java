package com.abhishek.algogrid.problems.binarysearchtree.BSTKeysInARange;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.BSTKeysInARangeInput;

public class BSTKeysInARange extends AGProblemTemplate<BSTKeysInARangeInput, int[]> {
    @Override
    protected String problemName() {
        return "BST Keys in a Range";
    }

    @Override
    protected void validate(BSTKeysInARangeInput input) {
    }

    @Override
    protected BSTKeysInARangeInput copyInput(BSTKeysInARangeInput input) {
        return input;
    }

    @Override
    protected String formatInput(BSTKeysInARangeInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.bstKeysInARange";
    }
}
