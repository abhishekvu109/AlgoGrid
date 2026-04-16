package com.abhishek.algogrid.problems.binarysearchtree.DeleteANodeFromBST;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.DeleteANodeFromBSTInput;

public class DeleteANodeFromBST extends AGProblemTemplate<DeleteANodeFromBSTInput, int[]> {
    @Override
    protected String problemName() {
        return "Delete a Node from BST";
    }

    @Override
    protected void validate(DeleteANodeFromBSTInput input) {
    }

    @Override
    protected DeleteANodeFromBSTInput copyInput(DeleteANodeFromBSTInput input) {
        return input;
    }

    @Override
    protected String formatInput(DeleteANodeFromBSTInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.deleteANodeFromBST";
    }
}
