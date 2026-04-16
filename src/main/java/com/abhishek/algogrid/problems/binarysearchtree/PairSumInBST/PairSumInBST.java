package com.abhishek.algogrid.problems.binarysearchtree.PairSumInBST;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.PairSumInBSTInput;

public class PairSumInBST extends AGProblemTemplate<PairSumInBSTInput, Boolean> {
    @Override
    protected String problemName() {
        return "Pair Sum in BST";
    }

    @Override
    protected void validate(PairSumInBSTInput input) {
    }

    @Override
    protected PairSumInBSTInput copyInput(PairSumInBSTInput input) {
        return input;
    }

    @Override
    protected String formatInput(PairSumInBSTInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.pairSumInBST";
    }
}
