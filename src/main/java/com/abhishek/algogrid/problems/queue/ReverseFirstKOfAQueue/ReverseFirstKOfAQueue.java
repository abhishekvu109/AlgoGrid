package com.abhishek.algogrid.problems.queue.ReverseFirstKOfAQueue;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.ReverseFirstKOfAQueueInput;

public class ReverseFirstKOfAQueue extends AGProblemTemplate<ReverseFirstKOfAQueueInput, int[]> {
    @Override
    protected String problemName() {
        return "Reverse First K of a Queue";
    }

    @Override
    protected void validate(ReverseFirstKOfAQueueInput input) {
    }

    @Override
    protected ReverseFirstKOfAQueueInput copyInput(ReverseFirstKOfAQueueInput input) {
        return input;
    }

    @Override
    protected String formatInput(ReverseFirstKOfAQueueInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.queue.reverseFirstKOfAQueue";
    }
}
