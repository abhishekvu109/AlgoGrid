package com.abhishek.algogrid.problems.linkedlist.SwapKthNodesFromEnds;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.SwapKthNodesFromEndsInput;

public class SwapKthNodesFromEnds extends AGProblemTemplate<SwapKthNodesFromEndsInput, int[]> {
    @Override
    protected String problemName() {
        return "Swap Kth Nodes From Ends";
    }

    @Override
    protected void validate(SwapKthNodesFromEndsInput input) {
    }

    @Override
    protected SwapKthNodesFromEndsInput copyInput(SwapKthNodesFromEndsInput input) {
        return input;
    }

    @Override
    protected String formatInput(SwapKthNodesFromEndsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.linkedlist.swapKthNodesFromEnds";
    }
}
