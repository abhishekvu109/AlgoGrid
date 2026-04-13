package com.abhishek.algogrid.strategies.arrays.LargestElementInAnArray;

import com.abhishek.algogrid.strategies.AGProblemStrategy;

import java.util.Arrays;

public class LargestElementInAnArrayUsingSorting implements AGProblemStrategy<Long[], Long> {
    @Override
    public Long solve(Long[] input) {
        Arrays.sort(input);
        return input[input.length - 1];
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
