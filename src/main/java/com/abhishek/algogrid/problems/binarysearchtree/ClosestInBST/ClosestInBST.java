package com.abhishek.algogrid.problems.binarysearchtree.ClosestInBST;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.ClosestInBSTInput;

public class ClosestInBST extends AGProblemTemplate<ClosestInBSTInput, Integer> {
    @Override
    protected String problemName() {
        return "Closest in BST";
    }

    @Override
    protected void validate(ClosestInBSTInput input) {
    }

    @Override
    protected ClosestInBSTInput copyInput(ClosestInBSTInput input) {
        return input;
    }

    @Override
    protected String formatInput(ClosestInBSTInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.closestInBST";
    }
}
