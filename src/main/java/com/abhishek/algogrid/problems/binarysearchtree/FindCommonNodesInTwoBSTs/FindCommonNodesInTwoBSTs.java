package com.abhishek.algogrid.problems.binarysearchtree.FindCommonNodesInTwoBSTs;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.FindCommonNodesInTwoBSTsInput;

public class FindCommonNodesInTwoBSTs extends AGProblemTemplate<FindCommonNodesInTwoBSTsInput, int[]> {
    @Override
    protected String problemName() {
        return "Find Common Nodes in Two BSTs";
    }

    @Override
    protected void validate(FindCommonNodesInTwoBSTsInput input) {
    }

    @Override
    protected FindCommonNodesInTwoBSTsInput copyInput(FindCommonNodesInTwoBSTsInput input) {
        return input;
    }

    @Override
    protected String formatInput(FindCommonNodesInTwoBSTsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.findCommonNodesInTwoBSTs";
    }
}
