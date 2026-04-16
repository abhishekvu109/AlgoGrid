package com.abhishek.algogrid.problems.hashing.UnionOfArraysWithDuplicates;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.UnionOfArraysWithDuplicatesInput;

public class UnionOfArraysWithDuplicates extends AGProblemTemplate<UnionOfArraysWithDuplicatesInput, int[]> {
    @Override
    protected String problemName() {
        return "Union of Arrays with Duplicates";
    }

    @Override
    protected void validate(UnionOfArraysWithDuplicatesInput input) {
    }

    @Override
    protected UnionOfArraysWithDuplicatesInput copyInput(UnionOfArraysWithDuplicatesInput input) {
        return input;
    }

    @Override
    protected String formatInput(UnionOfArraysWithDuplicatesInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.hashing.unionOfArraysWithDuplicates";
    }
}
