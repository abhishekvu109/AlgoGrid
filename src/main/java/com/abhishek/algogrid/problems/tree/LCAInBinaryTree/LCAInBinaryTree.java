package com.abhishek.algogrid.problems.tree.LCAInBinaryTree;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.LCAInBinaryTreeInput;

public class LCAInBinaryTree extends AGProblemTemplate<LCAInBinaryTreeInput, Integer> {
    @Override
    protected String problemName() {
        return "LCA in Binary Tree";
    }

    @Override
    protected void validate(LCAInBinaryTreeInput input) {
    }

    @Override
    protected LCAInBinaryTreeInput copyInput(LCAInBinaryTreeInput input) {
        return input;
    }

    @Override
    protected String formatInput(LCAInBinaryTreeInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.tree.lcaInBinaryTree";
    }
}
