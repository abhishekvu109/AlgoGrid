package com.abhishek.algogrid.strategies.arrays.SubArrayWithAGivenSum;

import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class SubArrayWithAGivenSumUsingPrefixSum implements AGProblemStrategy<int[], Integer> {
    @Override
    public Integer solve(int[] input) {
        int[] prefixSum=new int[input.length];
        prefixSum[0]=input[0];
        for (int i = 1; i < input.length; i++) {
            prefixSum[i]=prefixSum[i-1]+input[i];
        }

        return 0;
    }

    @Override
    public String name() {
        return "";
    }

    @Override
    public String timeComplexity() {
        return "";
    }

    @Override
    public String spaceComplexity() {
        return "";
    }
}
