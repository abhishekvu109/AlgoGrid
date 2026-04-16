package com.abhishek.algogrid.problems.sorting.MergeWithoutExtraSpace;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.MergeWithoutExtraSpaceInput;

public class MergeWithoutExtraSpace extends AGProblemTemplate<MergeWithoutExtraSpaceInput, int[]> {
    @Override
    protected String problemName() {
        return "Merge Without Extra Space";
    }

    @Override
    protected void validate(MergeWithoutExtraSpaceInput input) {
    }

    @Override
    protected MergeWithoutExtraSpaceInput copyInput(MergeWithoutExtraSpaceInput input) {
        return input;
    }

    @Override
    protected String formatInput(MergeWithoutExtraSpaceInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.sorting.mergeWithoutExtraSpace";
    }
}
