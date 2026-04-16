package com.abhishek.algogrid.problems.deque.KSizedSubarrayMaximum;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.KSizedSubarrayMaximumInput;

public class KSizedSubarrayMaximum extends AGProblemTemplate<KSizedSubarrayMaximumInput, int[]> {
    @Override
    protected String problemName() {
        return "K Sized Subarray Maximum";
    }

    @Override
    protected void validate(KSizedSubarrayMaximumInput input) {
    }

    @Override
    protected KSizedSubarrayMaximumInput copyInput(KSizedSubarrayMaximumInput input) {
        return input;
    }

    @Override
    protected String formatInput(KSizedSubarrayMaximumInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.deque.kSizedSubarrayMaximum";
    }
}
