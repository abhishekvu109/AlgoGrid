package com.abhishek.algogrid.problems.segmenttree.LargestSumContiguousSubarrayInRange;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.LargestSumContiguousSubarrayInRangeInput;

public class LargestSumContiguousSubarrayInRange extends AGProblemTemplate<LargestSumContiguousSubarrayInRangeInput, Integer> {
    @Override
    protected String problemName() {
        return "Largest Sum Contiguous Subarray in Range";
    }

    @Override
    protected void validate(LargestSumContiguousSubarrayInRangeInput input) {
    }

    @Override
    protected LargestSumContiguousSubarrayInRangeInput copyInput(LargestSumContiguousSubarrayInRangeInput input) {
        return input;
    }

    @Override
    protected String formatInput(LargestSumContiguousSubarrayInRangeInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.segmenttree.largestSumContiguousSubarrayInRange";
    }
}
