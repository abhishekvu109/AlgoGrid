package com.abhishek.algogrid.problems.hashing.SubarrayRangeWithGivenSum;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.SubarrayRangeWithGivenSumInput;

public class SubarrayRangeWithGivenSum extends AGProblemTemplate<SubarrayRangeWithGivenSumInput, Integer> {
    @Override
    protected String problemName() {
        return "Subarray Range with Given Sum";
    }

    @Override
    protected void validate(SubarrayRangeWithGivenSumInput input) {
    }

    @Override
    protected SubarrayRangeWithGivenSumInput copyInput(SubarrayRangeWithGivenSumInput input) {
        return input;
    }

    @Override
    protected String formatInput(SubarrayRangeWithGivenSumInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.hashing.subarrayRangeWithGivenSum";
    }
}
