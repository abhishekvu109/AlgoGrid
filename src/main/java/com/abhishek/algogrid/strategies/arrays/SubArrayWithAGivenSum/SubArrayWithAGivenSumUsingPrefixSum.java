package com.abhishek.algogrid.strategies.arrays.SubArrayWithAGivenSum;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.input.SubArrayWithAGivenSumInput;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

import java.util.HashMap;

public class SubArrayWithAGivenSumUsingPrefixSum implements AGProblemStrategy<SubArrayWithAGivenSumInput, int[]> {
    @Override
    public int[] solve(SubArrayWithAGivenSumInput input) {
        int[] arr = input.arr();
        int target = input.sum();
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        // Check prefix itself
        for (int i = 0; i < n; i++) {
            if (prefixSum[i] == target) {
                return new int[]{1, i + 1};
            }
        }
        // Check all subarrays using prefix sums
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (prefixSum[j] - prefixSum[i - 1] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{-1};
    }

    @Override
    public String name() {
        return "Using Prefix Sum Array";
    }

    @Override
    public String timeComplexity() {
        return TimeComplexity.BIG_O_OF_N_SQUARE;
    }

    @Override
    public String spaceComplexity() {
        return SpaceComplexity.BIG_OF_N;
    }
}
