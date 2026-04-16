package com.abhishek.algogrid.problems.binarysearchtree.LowestCommonAncestorInABST;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.LowestCommonAncestorInABSTInput;

public class LowestCommonAncestorInABST extends AGProblemTemplate<LowestCommonAncestorInABSTInput, Integer> {
    @Override
    protected String problemName() {
        return "Lowest Common Ancestor in a BST";
    }

    @Override
    protected void validate(LowestCommonAncestorInABSTInput input) {
    }

    @Override
    protected LowestCommonAncestorInABSTInput copyInput(LowestCommonAncestorInABSTInput input) {
        return input;
    }

    @Override
    protected String formatInput(LowestCommonAncestorInABSTInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.lowestCommonAncestorInABST";
    }
}
