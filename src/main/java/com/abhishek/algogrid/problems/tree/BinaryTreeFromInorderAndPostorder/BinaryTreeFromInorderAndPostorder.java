package com.abhishek.algogrid.problems.tree.BinaryTreeFromInorderAndPostorder;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.BinaryTreeFromInorderAndPostorderInput;

public class BinaryTreeFromInorderAndPostorder extends AGProblemTemplate<BinaryTreeFromInorderAndPostorderInput, int[]> {
    @Override
    protected String problemName() {
        return "Binary Tree from Inorder and Postorder";
    }

    @Override
    protected void validate(BinaryTreeFromInorderAndPostorderInput input) {
    }

    @Override
    protected BinaryTreeFromInorderAndPostorderInput copyInput(BinaryTreeFromInorderAndPostorderInput input) {
        return input;
    }

    @Override
    protected String formatInput(BinaryTreeFromInorderAndPostorderInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.tree.binaryTreeFromInorderAndPostorder";
    }
}
