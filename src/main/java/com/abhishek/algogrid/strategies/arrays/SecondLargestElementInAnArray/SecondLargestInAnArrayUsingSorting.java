package com.abhishek.algogrid.strategies.arrays.SecondLargestElementInAnArray;

import com.abhishek.algogrid.strategies.AGProblemStrategy;

import java.util.Arrays;

public class SecondLargestInAnArrayUsingSorting implements AGProblemStrategy<int[], Integer> {
    @Override
    public Integer solve(int[] input) {
        Arrays.sort(input);
        return input[input.length - 2];
    }

    @Override
    public String name() {
        return "Using Sorting";
    }

    @Override
    public String timeComplexity() {
        return "OLog(n)";
    }

    @Override
    public String spaceComplexity() {
        return "OLog(n)";
    }
}
