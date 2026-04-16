package com.abhishek.algogrid.problems.binarysearchtree.BottomViewOfBinaryTreeBST;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.BottomViewOfBinaryTreeBSTInput;

public class BottomViewOfBinaryTreeBST extends AGProblemTemplate<BottomViewOfBinaryTreeBSTInput, int[]> {
    @Override
    protected String problemName() {
        return "Bottom View of Binary Tree (BST)";
    }

    @Override
    protected void validate(BottomViewOfBinaryTreeBSTInput input) {
    }

    @Override
    protected BottomViewOfBinaryTreeBSTInput copyInput(BottomViewOfBinaryTreeBSTInput input) {
        return input;
    }

    @Override
    protected String formatInput(BottomViewOfBinaryTreeBSTInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.bottomViewOfBinaryTreeBST";
    }
}
