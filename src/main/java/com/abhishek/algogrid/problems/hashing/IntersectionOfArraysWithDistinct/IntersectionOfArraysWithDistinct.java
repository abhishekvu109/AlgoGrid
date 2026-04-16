package com.abhishek.algogrid.problems.hashing.IntersectionOfArraysWithDistinct;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.IntersectionOfArraysWithDistinctInput;

public class IntersectionOfArraysWithDistinct extends AGProblemTemplate<IntersectionOfArraysWithDistinctInput, int[]> {
    @Override
    protected String problemName() {
        return "Intersection of Arrays with Distinct";
    }

    @Override
    protected void validate(IntersectionOfArraysWithDistinctInput input) {
    }

    @Override
    protected IntersectionOfArraysWithDistinctInput copyInput(IntersectionOfArraysWithDistinctInput input) {
        return input;
    }

    @Override
    protected String formatInput(IntersectionOfArraysWithDistinctInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.hashing.intersectionOfArraysWithDistinct";
    }
}
