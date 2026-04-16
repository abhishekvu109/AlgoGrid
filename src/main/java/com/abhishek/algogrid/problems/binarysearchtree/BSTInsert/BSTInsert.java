package com.abhishek.algogrid.problems.binarysearchtree.BSTInsert;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.BSTInsertInput;

public class BSTInsert extends AGProblemTemplate<BSTInsertInput, int[]> {
    @Override
    protected String problemName() {
        return "BST Insert";
    }

    @Override
    protected void validate(BSTInsertInput input) {
    }

    @Override
    protected BSTInsertInput copyInput(BSTInsertInput input) {
        return input;
    }

    @Override
    protected String formatInput(BSTInsertInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.bstInsert";
    }
}
