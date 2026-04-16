package com.abhishek.algogrid.problems.hashing.HashingForPair2;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class HashingForPair2 extends AGProblemTemplate<int[], Integer> {
    @Override
    protected String problemName() {
        return "Hashing for Pair - 2";
    }

    @Override
    protected void validate(int[] input) {
    }

    @Override
    protected int[] copyInput(int[] input) {
        return input.clone();
    }

    @Override
    protected String formatInput(int[] input) {
        return Arrays.toString(input);
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.hashing.hashingForPair2";
    }
}
