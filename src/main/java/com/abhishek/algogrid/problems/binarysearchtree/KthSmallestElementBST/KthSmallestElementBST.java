package com.abhishek.algogrid.problems.binarysearchtree.KthSmallestElementBST;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.KthSmallestElementBSTInput;

public class KthSmallestElementBST extends AGProblemTemplate<KthSmallestElementBSTInput, Integer> {
    @Override
    protected String problemName() {
        return "Kth Smallest Element in BST";
    }

    @Override
    protected void validate(KthSmallestElementBSTInput input) {
    }

    @Override
    protected KthSmallestElementBSTInput copyInput(KthSmallestElementBSTInput input) {
        return input;
    }

    @Override
    protected String formatInput(KthSmallestElementBSTInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.kthSmallestElementBST";
    }
}
