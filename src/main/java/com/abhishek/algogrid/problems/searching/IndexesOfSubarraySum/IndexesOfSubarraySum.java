package com.abhishek.algogrid.problems.searching.IndexesOfSubarraySum;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.IndexesOfSubarraySumInput;

public class IndexesOfSubarraySum extends AGProblemTemplate<IndexesOfSubarraySumInput, int[]> {
    @Override
    protected String problemName() {
        return "Indexes of Subarray Sum";
    }

    @Override
    protected void validate(IndexesOfSubarraySumInput input) {
    }

    @Override
    protected IndexesOfSubarraySumInput copyInput(IndexesOfSubarraySumInput input) {
        return input;
    }

    @Override
    protected String formatInput(IndexesOfSubarraySumInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.searching.indexesOfSubarraySum";
    }
}
