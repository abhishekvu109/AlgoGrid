package com.abhishek.algogrid.problems.binarysearchtree.FloorInBST;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.FloorInBSTInput;

public class FloorInBST extends AGProblemTemplate<FloorInBSTInput, Integer> {
    @Override
    protected String problemName() {
        return "Floor in BST";
    }

    @Override
    protected void validate(FloorInBSTInput input) {
    }

    @Override
    protected FloorInBSTInput copyInput(FloorInBSTInput input) {
        return input;
    }

    @Override
    protected String formatInput(FloorInBSTInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.floorInBST";
    }
}
