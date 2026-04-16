package com.abhishek.algogrid.problems.binarysearchtree.TopViewOfBinaryTreeBST;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.TopViewOfBinaryTreeBSTInput;

public class TopViewOfBinaryTreeBST extends AGProblemTemplate<TopViewOfBinaryTreeBSTInput, int[]> {
    @Override
    protected String problemName() {
        return "Top View of Binary Tree";
    }

    @Override
    protected void validate(TopViewOfBinaryTreeBSTInput input) {
    }

    @Override
    protected TopViewOfBinaryTreeBSTInput copyInput(TopViewOfBinaryTreeBSTInput input) {
        return input;
    }

    @Override
    protected String formatInput(TopViewOfBinaryTreeBSTInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.topViewOfBinaryTreeBST";
    }
}
