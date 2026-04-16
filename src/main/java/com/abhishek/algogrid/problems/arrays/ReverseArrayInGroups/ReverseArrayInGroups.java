package com.abhishek.algogrid.problems.arrays.ReverseArrayInGroups;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.ReverseArrayInGroupsInput;

public class ReverseArrayInGroups extends AGProblemTemplate<ReverseArrayInGroupsInput, int[]> {
    @Override
    protected String problemName() {
        return "Reverse Array in Groups";
    }

    @Override
    protected void validate(ReverseArrayInGroupsInput input) {
    }

    @Override
    protected ReverseArrayInGroupsInput copyInput(ReverseArrayInGroupsInput input) {
        return input;
    }

    @Override
    protected String formatInput(ReverseArrayInGroupsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.arrays.reverseArrayInGroups";
    }
}
