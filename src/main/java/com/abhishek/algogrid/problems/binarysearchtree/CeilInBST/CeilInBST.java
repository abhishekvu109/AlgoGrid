package com.abhishek.algogrid.problems.binarysearchtree.CeilInBST;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.CeilInBSTInput;

public class CeilInBST extends AGProblemTemplate<CeilInBSTInput, Integer> {
    @Override
    protected String problemName() {
        return "Ceil in BST";
    }

    @Override
    protected void validate(CeilInBSTInput input) {
    }

    @Override
    protected CeilInBSTInput copyInput(CeilInBSTInput input) {
        return input;
    }

    @Override
    protected String formatInput(CeilInBSTInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.ceilInBST";
    }
}
